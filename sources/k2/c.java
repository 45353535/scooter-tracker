package k2;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f85956a = new c();

    private c() {
    }

    public static final List a(View view) {
        if (e3.a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupJ = n2.f.j(view);
            if (viewGroupJ != null) {
                for (View view2 : n2.f.b(viewGroupJ)) {
                    if (view != view2) {
                        arrayList.addAll(f85956a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            e3.a.b(th2, c.class);
            return null;
        }
    }

    public static final List b(View view) {
        if (e3.a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(n2.f.i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    Intrinsics.checkNotNullExpressionValue(resourceName, "resourceName");
                    String[] strArr = (String[]) new Regex("/").j(resourceName, 0).toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            e3.a.b(th2, c.class);
            return null;
        }
    }

    private final List c(View view) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String string = ((TextView) view).getText().toString();
                if (string.length() > 0 && string.length() < 100) {
                    String lowerCase = string.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                Iterator it = n2.f.b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(c((View) it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final boolean d(String str, List list) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.g0(str, (String) it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    public static final boolean e(List indicators, List keys) {
        if (e3.a.d(c.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(indicators, "indicators");
            Intrinsics.checkNotNullParameter(keys, "keys");
            Iterator it = indicators.iterator();
            while (it.hasNext()) {
                if (f85956a.d((String) it.next(), keys)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, c.class);
            return false;
        }
    }

    public static final boolean f(String text, String rule) {
        if (e3.a.d(c.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(rule, "rule");
            return new Regex(rule).g(text);
        } catch (Throwable th2) {
            e3.a.b(th2, c.class);
            return false;
        }
    }
}
