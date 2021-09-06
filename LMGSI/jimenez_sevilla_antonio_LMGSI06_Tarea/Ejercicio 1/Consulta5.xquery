for $cli in doc("clientes.xml")//cliente,
    $hab in doc("habitaciones.xml")//habitacion
    where $hab/tipo = "suite" and $cli/id_cliente = $hab/id_cliente
    return <datos_suite>{($cli/nombre, $cli/apellidos, $cli/telefono)}</datos_suite>