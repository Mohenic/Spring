package sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com")
public class Computer {
	
	private CPU cpu;
	private RAM ram;
	
	// DI - Field Inject (필드에서 주입)
	@Autowired
	private HDD hdd;
	
	// DI - Constructor Injection(생성자 주입)
	@Autowired
	public Computer(CPU cpu) {
		this.cpu = cpu;
	}
	
	// DI - Setter Inject(세터로 주입)
	@Autowired
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	
	public void show() {
		cpu.show();
		ram.show();
		hdd.show();
	}

}
