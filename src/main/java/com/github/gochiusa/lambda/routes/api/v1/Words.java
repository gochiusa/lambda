package com.github.gochiusa.lambda.routes.api.v1;

import com.amazonaws.services.lambda.runtime.Context;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Words {

    private static final Random random = new Random();
    private static final List<String> words = Arrays.asList(
            "喫茶店... ラビットハウス...",
            "この前お客さんにココアちゃんはシスター・コンプレックスだねって言われちゃった",
            "リゼちゃん聞いてー私シスター・コンプレックスなんだって",
            "今回の新作もすごいねー まるで本物の戦場だよ",
            "うっさぎ〜 うっさぎ〜♪",
            "ウサギがいない!?",
            "コーヒー3杯頼んだから3回触る権利を手に入れたよ!",
            "この上品な香り！これがブルーマウンテンかー",
            "この酸味・・・キリマンジャロだね",
            "安心する味！これインスタントの・・・",
            "はぁ〜もふもふ気持ちいい〜 いけないよだれが・・・",
            "なんかこの子にダンディな声で拒絶されたんだけど"
    );

    public String get(final Context context) {
        return words.get(random.nextInt(words.size()));
    }

}
