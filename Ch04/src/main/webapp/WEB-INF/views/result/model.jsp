<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>result::model</title>
	</head>
	<body>
		<h3>@ModelAttribute 어노테이션 실습</h3>
		
		<a href="/Ch04/index">index</a>
		
		<h4>model1 결과</h4>
		<p>
			uid : ${modelDTO.uid}
		</p>
		
		<h4>model2 결과</h4>
		<p>
			uid : ${modelDTO.uid}<br>
			name : ${modelDTO.name}<br>
		</p>
		
		<h4>modell3 결과</h4>
		<p>
			uid : ${modelDTO.uid}<br>
			name : ${modelDTO.name}<br>
			hp : ${modelDTO.hp}<br>
			age : ${modelDTO.age}<br>
		</p>
		
	</body>
</html>