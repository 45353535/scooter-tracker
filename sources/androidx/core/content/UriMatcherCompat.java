package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes.dex */
public class UriMatcherCompat {
    private UriMatcherCompat() {
    }

    public static /* synthetic */ boolean a(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }

    @NonNull
    public static Predicate<Uri> asPredicate(@NonNull final UriMatcher uriMatcher) {
        return new Predicate() { // from class: androidx.core.content.w
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return androidx.core.util.i.a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return androidx.core.util.i.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate) {
                return androidx.core.util.i.c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return UriMatcherCompat.a(uriMatcher, (Uri) obj);
            }
        };
    }
}
