package com.jason.mvnbook.account.email;

import com.jason.mvnbook.account.email.exceptions.AccountEmailException;

public interface AccountEmailService
{
    void sendMail( String to, String subject, String htmlText )
        throws AccountEmailException;
}
