/**
 * 
 */

function validacion() {

	var isbn = $("isbn");
	var titulo = document.getElementById("titulo");
	var miformulario = document.getElementById("formularioInsert");

	if (isbn.value == "") {
		// alert("datos no validos");
		modal(isbn);
		return false;
	} else {
		if (titulo.value == "") {
			// alert("datos no validos");
			modal(titulo.tagName);
			return false;
		} else {
			miformulario.submit();
		}
	}
}

function redireccionar(opc) {
	var url;

	if (opc == 0) {
		url = 'FormularioInsertarLibro.html';

	} else if (opc == 1) {
		url = 'MostrarLibros.jsp';
	}

	location.href = url;

}

function modal(campo) {

	// Actualizar funcion para adquirir el error y el campo que tiene error
	// var info = [ campo ];
	$("#info").text(campo);

	// $(".modal-body").html();
	$('#myModal').modal('show');
}
