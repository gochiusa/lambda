package com.github.gochiusa.lambda.routes.api.v1.text;

import com.amazonaws.services.lambda.runtime.Context;

import java.util.List;
import java.util.Random;

public class Words {

    private static final Random random = new Random();

    public String get(final Context context) {
        final List<String> words = com.github.gochiusa.lambda.routes.api.v1.Words.words;
        return words.get(random.nextInt(words.size()));
    }

}
