for $x in doc("clientes.xml")//clientes/cliente
where $x/nacionalidad= "Alemania"
return  <Aleman>{$x}</Aleman>



