<html>
<head>
<@ui.commonMETA/>
<title>用户列表</title>
<@ui.commonCSS/>
</head>
<body>
<a href="${webRoot}/user/userList.html">打开</a>
<a href="${jsRoot}/user/userList.html">打开</a>
	<table>
		<#list result.recordList as user>
		<tr>
			<td>
				${user.id}
			</td>
			<td>
				${user.createDate?string("yyyy-MM-dd HH:mm:ss")}
			</td>
		</tr>
		</#list>
	</table>
</body>
<@ui.commonJQUERY/>
</html>