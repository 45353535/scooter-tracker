package pd;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {
    public static final void a(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        for (String key : sharedPreferences.getAll().keySet()) {
            Intrinsics.checkNotNullExpressionValue(key, "key");
            l(sharedPreferences, key);
        }
    }

    public static final void b(SharedPreferences sharedPreferences, Function1 editAction) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(editAction, "editAction");
        try {
            SharedPreferences.Editor edit$lambda$8$lambda$7 = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(edit$lambda$8$lambda$7, "edit$lambda$8$lambda$7");
            editAction.invoke(edit$lambda$8$lambda$7);
            edit$lambda$8$lambda$7.apply();
            Unit unit = Unit.f93236a;
        } catch (Throwable unused) {
        }
    }

    public static final int c(SharedPreferences sharedPreferences, String key, int i10) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (sharedPreferences.contains(key)) {
            return sharedPreferences.getInt(key, i10);
        }
        Unit unit = Unit.f93236a;
        return i10;
    }

    public static final long d(SharedPreferences sharedPreferences, String key, long j10) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (sharedPreferences.contains(key)) {
            return sharedPreferences.getLong(key, j10);
        }
        Unit unit = Unit.f93236a;
        return j10;
    }

    public static final String e(SharedPreferences sharedPreferences, String key, String str) {
        String string;
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (sharedPreferences.contains(key) && (string = sharedPreferences.getString(key, str)) != null) {
                return string;
            }
            Unit unit = Unit.f93236a;
        } catch (Throwable unused) {
        }
        return str;
    }

    public static final SharedPreferences.Editor f(SharedPreferences.Editor editor, String key, Integer num) {
        Intrinsics.checkNotNullParameter(editor, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (num == null) {
            editor.remove(key);
            return editor;
        }
        editor.putInt(key, num.intValue());
        return editor;
    }

    public static final void g(SharedPreferences sharedPreferences, String key, Integer num) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (num == null) {
            l(sharedPreferences, key);
            return;
        }
        SharedPreferences.Editor putOrRemove$lambda$12 = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(putOrRemove$lambda$12, "putOrRemove$lambda$12");
        putOrRemove$lambda$12.putInt(key, num.intValue());
        putOrRemove$lambda$12.apply();
    }

    public static final SharedPreferences.Editor h(SharedPreferences.Editor editor, String key, Long l10) {
        Intrinsics.checkNotNullParameter(editor, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (l10 == null) {
            editor.remove(key);
            return editor;
        }
        editor.putLong(key, l10.longValue());
        return editor;
    }

    public static final void i(SharedPreferences sharedPreferences, String key, Long l10) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (l10 == null) {
            l(sharedPreferences, key);
            return;
        }
        SharedPreferences.Editor putOrRemove$lambda$12 = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(putOrRemove$lambda$12, "putOrRemove$lambda$12");
        putOrRemove$lambda$12.putLong(key, l10.longValue());
        putOrRemove$lambda$12.apply();
    }

    public static final SharedPreferences.Editor j(SharedPreferences.Editor editor, String key, String str) {
        Intrinsics.checkNotNullParameter(editor, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (str == null) {
            editor.remove(key);
            return editor;
        }
        editor.putString(key, str);
        return editor;
    }

    public static final void k(SharedPreferences sharedPreferences, String key, String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (str == null) {
            l(sharedPreferences, key);
            return;
        }
        SharedPreferences.Editor putOrRemove$lambda$12 = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(putOrRemove$lambda$12, "putOrRemove$lambda$12");
        putOrRemove$lambda$12.putString(key, str);
        putOrRemove$lambda$12.apply();
    }

    public static final void l(SharedPreferences sharedPreferences, String key) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sharedPreferences.edit().remove(key).apply();
    }
}
