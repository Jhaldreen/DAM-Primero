let $count :=count(doc("habitaciones.xml")//habitacion[num_ocupantes>1])
return "Habitaciones ocupadas por más de una persona: " || $count
