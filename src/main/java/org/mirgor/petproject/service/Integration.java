package org.mirgor.petproject.service;

import java.io.IOException;
import java.security.GeneralSecurityException;

public interface Integration {

    void fetchNewEvents() throws IOException, GeneralSecurityException;
}
