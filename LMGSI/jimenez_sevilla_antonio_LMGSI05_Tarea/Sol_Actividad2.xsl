<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>
    <xsl:template match="/">
        <html>
            <head>
                <title>Premios Planeta</title>
                <link rel="stylesheet" type="text/css" href="estilos.css"/>
            </head>
            
            <body>
                <div>
                    <h1>Premiadas españolas</h1>
                    <table>
                        <thead>
                            <tr>
                                <th>Año</th>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Titulo</th>
                                <th>Comentario</th>
                            </tr>
                        </thead>
                        <tbody>
                             <xsl:for-each select="//libros/libro">
                                <xsl:sort select="@fecha" data-type="number" order="ascending"/>
                                <xsl:if
                                    test="autor = //autores/autor[nacimiento/@pais = 'España' and nacimiento/@sexo='mujer']/@codautor">
                                    <xsl:variable name="id_autor" select="autor"/>
                                    <tr>
                                        <td>
                                            <xsl:value-of select="@fecha"/>
                                        </td>
                                        <td>
                                            <xsl:value-of select="//autor[@codautor=$id_autor]/nombre"/>
                                        </td>
                                        <td>
                                            <xsl:value-of select="//autor[@codautor=$id_autor]/apellido"/>
                                        </td>
                                        <td>
                                            <xsl:value-of select="titulo"/>
                                        </td>
                                        <td>
                                            <xsl:choose>
                                                <xsl:when test="@fecha &lt; '2010'">Periodo 2000-2009</xsl:when>
                                                <xsl:when test="@fecha &gt; '2009'">Periodo 2010-2020</xsl:when>
                                                <xsl:otherwise>El año es erroneo</xsl:otherwise>
                                            </xsl:choose>
                                        </td>
                                    </tr>
                                </xsl:if>
                            </xsl:for-each>
                        </tbody>
                    </table>
                    <br/>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
