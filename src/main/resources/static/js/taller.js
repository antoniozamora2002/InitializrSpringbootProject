$(document).ready(function () {
    listar();
});
function listar() {
    $.ajax({
        url: "/taller/all",
        type: 'GET',
        success: function (x) {
            $("#table tbody tr").remove();
            x.forEach((item, index, array) => {
                $("#table").append(
                        "<tr>\n\
                            <td>" + (index + 1) + "</td>\n\
                            <td>" + item.tallTerm + "</td>\n\
                            <td>" + item.tallDate + "</td>\n\
                            <td>" + item.tallTime + "</td>\n\
                            <td>" + item.tallDireccion + "</td>\n\
                            <td style='text-align: center'>\n\
                                <a href='#' onclick='editar("+ item.tallId + ")'><i class='fa-solid fa-pen-to-square yelow'></i></a>\n\
                            </td>\n\
                            <td style='text-align: center'>\n\
                                <a href='#' onclick='eliminar(" + item.tallId + ")'><i class='fa-solid fa-trash-can red'></i></a>\n\
                            </td>\n\
                        </tr>");

            });
        }
    });
}
function editar(id) {
    $.ajax({
        url: "/taller/" + id,
        type: 'GET',
        success: function (w) {
            $("#edit_tallId").val(w.tallId);
            $("#edit_tema").val(w.tallTerm);
            $("#edit_date").val(w.tallDate);
            $("#edit_time").val(w.tallTime);
            $("#edit_direccion").val(w.tallDireccion);
        }
    });
    $("#editarModal").modal('show');
}
function eliminar(id) {
    bootbox.confirm({
        message: "¿Está seguro que desea eliminar el registro?",
        closeButton: false,
        title: "Eliminar",
        buttons: {
            confirm: {
                label: 'Eliminar',
                className: 'btn-primary'
            },
            cancel: {
                label: 'Cancelar',
                className: 'btn-danger'
            }
        },
        callback: function (result) {
            if (result) {
                $.ajax({
                    url: "/taller/" + id,
                    type: 'DELETE',
                    success: function (w) {
                        var dialog = bootbox.dialog({
                            message: '<p class="text-center mb-0"><i class="fa fa-spin fa-spinner"></i> Registro Eliminado Correctamente.</p>',
                            closeButton: false
                        });
                        setTimeout(function () {
                            dialog.modal('hide');
                        }, 1500);
                        listar();
                    }
                });
            } else {
                var dialog = bootbox.dialog({
                    message: '<p class="text-center mb-0"><i class="fa fa-spin fa-spinner"></i> Registro no Eliminado.</p>',
                    closeButton: false
                });
                setTimeout(function () {
                    dialog.modal('hide');
                }, 1500);
            }
        }
    });
}
$("#guardar").click(function () {
    $.ajax({
        url: "/taller/save",
        type: 'POST',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify({
            tallTerm: $("#tema").val(),
            tallDate: $("#tallDate").val(), 
            tallTime: $("#tallTime").val(), 
            tallDireccion: $("#tallDireccion").val(),
            tallEstado:true
        }),
        cache: false,
        success: function (w) {
            var dialog = bootbox.dialog({
                message: '<p class="text-center mb-0"><i class="fa fa-spin fa-spinner"></i> Registro Guardado Correctamente.</p>',
                closeButton: false
            });
            setTimeout(function () {
                dialog.modal('hide');
            }, 1500);
            limpiar();
            listar();
        }
    });
    $("#exampleModal").modal('hide');
});
function limpiar() {
    $("#tema").val(),
    $("#tallDate").val(), 
    $("#tallTime").val(), 
    $("#tallDireccion").val();
}

$("#modificar").click(function () {
    $.ajax({
        url: "/taller/update",
        type: 'PUT',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify({
            tallId: $("#edit_tallId").val(),
            tallTerm: $("#edit_tema").val(),
            tallDate: $("#edit_date").val(),
            tallTime: $("#edit_time").val(),
            tallDireccion: $("#edit_direccion").val()
        }),
        cache: false,
        success: function (w) {
            var dialog = bootbox.dialog({
                message: '<p class="text-center mb-0"><i class="fa fa-spin fa-spinner"></i> Registro Modificado Correctamente.</p>',
                closeButton: false
            });
            setTimeout(function () {
                dialog.modal('hide');
            }, 1500);
            listar();
        }
    });
    $("#editarModal").modal('hide');
});
