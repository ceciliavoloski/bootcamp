package com.project2.bootcamp2.exceptions;

import com.project2.bootcamp2.util.MessageUtils;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

public class NotFoundException extends RuntimeException {
    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
