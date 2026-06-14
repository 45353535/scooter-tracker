package kotlin.text;

import java.util.regex.Matcher;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult e(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new h(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new h(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange g(java.util.regex.MatchResult matchResult) {
        return kotlin.ranges.g.v(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange h(java.util.regex.MatchResult matchResult, int i10) {
        return kotlin.ranges.g.v(matchResult.start(i10), matchResult.end(i10));
    }
}
