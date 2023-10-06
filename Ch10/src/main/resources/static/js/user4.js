$(function(){
	
	// User1
	$('#btnUser4s').click(function(){
		
		$.ajax({
			url : '/Ch10/user4',
			type : 'GET',
			dataType : 'json',
			success: function(data){
				console.log(data);
			}
		});
		
	});
	
	$('#btnUser4').click(function(){
		
		$.ajax({
			url : '/Ch10/user4/김유신',
			type : 'GET',
			dataType : 'json',
			success: function(data){
				console.log(data);
			}
		});
		
	});
	
	$('#btnUser4Register').click(function(){
		
		const jsonData = {
			name: '홍길동',
			gender: 'M',
			age: 22,
			addr: '김해시'
		};
		
		$.ajax({
			url : '/Ch10/user4',
			type : 'POST',
			data: jsonData,
			dataType : 'json',
			success: function(data){
				console.log(data);
			}
		});
		
	});
	
	$('#btnUser4Modify').click(function(){
		
		const jsonData = {
			name: '홍길동',
			gender: 'M',
			age: 25,
			addr: '김해시'
		};
		
		$.ajax({
			url : '/Ch10/user4',
			type : 'PUT',
			data: jsonData,
			dataType : 'json',
			success: function(data){
				console.log(data);
			}
		});
		
	});
	
	$('#btnUser4Delete').click(function(){
		
		$.ajax({
			url : '/Ch10/user4/홍길동',
			type : 'DELETE',
			dataType : 'json',
			success: function(data){
				console.log(data);
			}
		});
		
	});
	
})