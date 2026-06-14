package yads;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f118280a;

    static {
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%3$s) { \n      return %4$s.%1$s(%2$s, %3$s); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", Arrays.copyOf(new Object[]{"onAdRender", "document.querySelector('#rtb').offsetHeight", "testTag", "AdPerformActionsJSI"}, 4)), "format(...)");
        String str = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function() { \n      return %2$s.%1$s(); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", Arrays.copyOf(new Object[]{"getBannerInfo", "AdPerformActionsJSI"}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        f118280a = str;
    }

    public static String a() {
        return f118280a;
    }
}
