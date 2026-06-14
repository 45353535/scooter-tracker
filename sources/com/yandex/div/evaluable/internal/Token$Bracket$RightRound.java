package com.yandex.div.evaluable.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/yandex/div/evaluable/internal/Token$Bracket$RightRound", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Token$Bracket$RightRound implements Token {

    @NotNull
    public static final Token$Bracket$RightRound INSTANCE = new Token$Bracket$RightRound();

    private Token$Bracket$RightRound() {
    }

    @NotNull
    public String toString() {
        return ")";
    }
}
