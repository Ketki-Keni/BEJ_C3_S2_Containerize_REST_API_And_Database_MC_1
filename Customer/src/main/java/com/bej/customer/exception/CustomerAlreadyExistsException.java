/*
 * Author : Ketki Keni
 * Date : 07-02-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.bej.customer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT , reason = "Customer already exists")
public class CustomerAlreadyExistsException extends Exception{
}
