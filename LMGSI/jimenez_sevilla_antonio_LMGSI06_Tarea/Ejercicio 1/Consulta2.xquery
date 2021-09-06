for $x in doc("habitaciones.xml")//habitaciones/habitacion
where $x/num_ocupantes = 2
order by $x/id_cliente descending
return $x/id_cliente


