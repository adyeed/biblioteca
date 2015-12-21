<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- sentencias de import necesarias para jdbc-->
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.sql.ResultSet"%>

<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!doctype html>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css" href="./css/main.css" />
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="./css/material-fullpalette.min.css" />

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Libros</title>
</head>
<body>



	<section>
		<DIV class="container ">
			<DIV class="row">
				<DIV class="col-lg-6">


					<table class="table table-hover center-table">
						<thead>
							<tr>
								<td>1</td>
								<td>Column content</td>
								<td>Column content</td>
								<td>Column content</td>
							</tr>
						</thead>
						<tbody>
							<%
								Connection conexion = null;
								Statement sentencia = null;
								ResultSet rs = null;
								try {
									Class.forName("com.mysql.jdbc.Driver");
									//1
									conexion = DriverManager.getConnection("jdbc:mysql://localhost/arquitecturajava", "root", "Omicron2015");
									sentencia = conexion.createStatement();
									//2
									String consultaSQL = "select isbn,titulo,categoria from libros";
									//3 y 4
									rs = sentencia.executeQuery(consultaSQL);
									//5
									while (rs.next()) {
							%>
							<tr>
								<td class="text-center"><%=rs.getString("isbn")%></td>
								<td class="text-center"><%=rs.getString("titulo")%></td>
								<td class="text-center"><%=rs.getString("categoria")%></td>
							</tr>
							<%
								}
								} catch (ClassNotFoundException e) {
									System.out.println("Error en la carga del driver"

									+ e.getMessage());
								} catch (SQLException e) {
									System.out.println("Error accediendo a la base de datos" + e.getMessage());
								} finally {
									//6
									if (rs != null) {
										try {
											rs.close();
										} catch (SQLException e) {
											System.out.println("Error cerrando el resultset" + e.getMessage());
										}
									}
									if (sentencia != null) {
										try {
											sentencia.close();
										} catch (SQLException e) {
											System.out.println("Error cerrando la sentencia" + e.getMessage());
										}
									}
									if (conexion != null) {
										try {
											conexion.close();
										} catch (SQLException e) {
											System.out.println("Error cerrando la conexion" + e.getMessage());
										}
									}
								}
							%>
						</tbody>
					</table>
				</DIV>
			</DIV>
		</DIV>
	</section>

	<br>
	<br>
	<br>
	<a href="FormularioInsertarLibro.html">Insertar Libro</a>
	<br>
	<a href="index.html">inicio</a>
	<!-- 	JavaScript -->
	<script type="text/javascript" src="./js/home.js"></script>
	<script type="text/javascript" src="./js/jquery-2.1.3.min.js"></script>
	<script type="text/javascript" src="./js/bootstrap.min.js"></script>
	<script type="text/javascript" src="./js/material.min.js"></script>
</body>
</html>