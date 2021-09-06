for $x in doc("clientes.xml")//clientes/cliente
where $x/habitual = "Si"
order by $x/nombre
return  <cliente_habitual>{($x/nombre, $x/apellidos)}</cliente_habitual>

