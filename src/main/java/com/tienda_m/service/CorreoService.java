
package com.tienda_m.service;

import jakarta.mail.MessagingException;


public interface CorreoService {
    
    //La firma del metodo para enviar correos html
    public void enviarCorreoHtml(
            String para,
            String ausnto,
            String contenidoHtml)
            throws MessagingException;

}
