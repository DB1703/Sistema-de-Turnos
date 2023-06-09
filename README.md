# Sistema-de-Turnos
Se desea implementar un sistema que permita administrar la reserva de turnos para una clínica odontológica.

Este debe cumplir con los siguientes requerimientos:
  
  ● Administración de datos de odontólogos: listar, agregar, modificar y eliminar
    odontólogos. Registrar apellido, nombre y matrícula de los mismos.
  
  ● Administración de datos de los pacientes: listar, agregar, modificar y eliminar
    pacientes. De cada uno se almacenan: nombre, apellido, domicilio, DNI y fecha de
    alta.
  
  ● Registrar turno: se tiene que poder permitir asignar a un paciente un turno con un
    odontólogo a una determinada fecha y hora.
  
  ● Login: validar el ingreso al sistema mediante un login con usuario y password. Se
    debe permitir a cualquier usuario logueado (ROLE_USER) registrar un turno, pero
    solo a quienes tengan un rol de administración (ROLE_ADMIN) poder gestionar
    odontólogos y pacientes. Un usuario podrá tener un único rol y los mismos se
    ingresarán directamente en la base de datos.
