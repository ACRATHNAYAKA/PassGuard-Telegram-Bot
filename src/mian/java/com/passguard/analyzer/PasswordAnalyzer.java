package com.passguard.analyzer;

import com.nulabinc.zxcvbn.Zxcvbn;

public class PasswordAnalyzer {
    private final Zxcvbn zxcvbn;
    private final static int MIN_LENGTH = 12;//NIST standards
    private final static int RECOMMENDED_LENGTH = 16;
    private final static int MAX_SCORE = 100;


    public PasswordAnalyzer (Zxcvbn zxcvbn){
        if (zxcvbn == null){
            throw new IllegalArgumentException("zxcvbn cant be null");
        }

        this.zxcvbn = zxcvbn;
    }

    public PasswordResult analyzePassword(String password){

    }
}
