package n2;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.internal.z;
import com.taurusx.tax.y.z.w.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f95103a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f95104b = f.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static WeakReference f95105c = new WeakReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f95106d;

    private f() {
    }

    public static final View a(View view) {
        if (e3.a.d(f.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!f95103a.q(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th2) {
                e3.a.b(th2, f.class);
            }
        }
        return null;
    }

    public static final List b(View view) {
        if (e3.a.d(f.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i10));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
            return null;
        }
    }

    public static final int c(View view) {
        if (e3.a.d(f.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            int i10 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i10 |= 32;
            }
            if (o(view)) {
                i10 |= 512;
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    return view instanceof RatingBar ? 65536 | i10 : view instanceof RadioGroup ? i10 | 16384 : ((view instanceof ViewGroup) && f95103a.p(view, (View) f95105c.get())) ? i10 | 64 : i10;
                }
                return i10 | 4096;
            }
            int i11 = i10 | 1025;
            if (view instanceof Button) {
                i11 = i10 | 1029;
                if (view instanceof Switch) {
                    i11 = i10 | 9221;
                } else if (view instanceof CheckBox) {
                    i11 = 33797 | i10;
                }
            }
            return view instanceof EditText ? i11 | 2048 : i11;
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
            return 0;
        }
    }

    public static final JSONObject d(View view) {
        if (e3.a.d(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f95105c = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List listB = b(view);
                int size = listB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put(d((View) listB.get(i10)));
                }
                jSONObject.put("childviews", jSONArray);
                return jSONObject;
            } catch (JSONException e10) {
                Log.e(f95104b, "Failed to create JSONObject for view.", e10);
                return jSONObject;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
            return null;
        }
    }

    private final JSONObject e(View view) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException e10) {
                Log.e(f95104b, "Failed to create JSONObject for dimension.", e10);
                return jSONObject;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final Class f(String str) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public static final View.OnClickListener g(View view) {
        Field declaredField;
        if (e3.a.d(f.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View.OnClickListener");
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
            return null;
        }
    }

    public static final View.OnTouchListener h(View view) {
        Field declaredField;
        try {
            if (e3.a.d(f.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField2 = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.view.View.OnTouchListener");
                    return (View.OnTouchListener) obj2;
                } catch (ClassNotFoundException e10) {
                    z.Z(f95104b, e10);
                } catch (IllegalAccessException e11) {
                    z.Z(f95104b, e11);
                }
            } catch (NoSuchFieldException e12) {
                z.Z(f95104b, e12);
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
            return null;
        }
    }

    public static final String i(View view) {
        if (e3.a.d(f.class)) {
            return null;
        }
        try {
            CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
            if (hint == null) {
                return "";
            }
            String string = hint.toString();
            return string == null ? "" : string;
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
            return null;
        }
    }

    public static final ViewGroup j(View view) {
        if (e3.a.d(f.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String k(android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.f.k(android.view.View):java.lang.String");
    }

    private final View l(float[] fArr, View view) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            n();
            Method method = f95106d;
            if (method != null && view != null) {
                try {
                    if (method == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    Object objInvoke = method.invoke(null, fArr, view);
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.view.View");
                    View view2 = (View) objInvoke;
                    if (view2.getId() > 0) {
                        Object parent = view2.getParent();
                        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
                        return (View) parent;
                    }
                } catch (IllegalAccessException e10) {
                    z.Z(f95104b, e10);
                } catch (InvocationTargetException e11) {
                    z.Z(f95104b, e11);
                }
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final float[] m(View view) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            view.getLocationOnScreen(new int[2]);
            return new float[]{r3[0], r3[1]};
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final void n() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (f95106d != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f95106d = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e10) {
                z.Z(f95104b, e10);
            } catch (NoSuchMethodException e11) {
                z.Z(f95104b, e11);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private static final boolean o(View view) {
        if (e3.a.d(f.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            f fVar = f95103a;
            Class clsF = fVar.f("android.support.v4.view.NestedScrollingChild");
            if (clsF != null && clsF.isInstance(parent)) {
                return true;
            }
            Class clsF2 = fVar.f("androidx.core.view.NestedScrollingChild");
            if (clsF2 != null) {
                if (clsF2.isInstance(parent)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
            return false;
        }
    }

    private final boolean q(View view) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            return Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    public static final void r(View view, View.OnClickListener onClickListener) {
        Field declaredField;
        Field declaredField2;
        if (e3.a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Object obj = null;
            try {
                try {
                    declaredField = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredField("mListenerInfo");
                } catch (ClassNotFoundException | NoSuchFieldException unused) {
                    declaredField = null;
                }
                try {
                    declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                    declaredField2 = null;
                }
                if (declaredField == null || declaredField2 == null) {
                    view.setOnClickListener(onClickListener);
                    return;
                }
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                try {
                    declaredField.setAccessible(true);
                    obj = declaredField.get(view);
                } catch (IllegalAccessException unused3) {
                }
                if (obj == null) {
                    view.setOnClickListener(onClickListener);
                } else {
                    declaredField2.set(obj, onClickListener);
                }
            } catch (Exception unused4) {
            }
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
        }
    }

    public static final void s(View view, JSONObject json) {
        if (e3.a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String strK = k(view);
                String strI = i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put("classname", view.getClass().getCanonicalName());
                json.put("classtypebitmask", c(view));
                json.put("id", view.getId());
                if (d.g(view)) {
                    json.put("text", "");
                    json.put("is_user_input", true);
                } else {
                    json.put("text", z.j(z.p0(strK), ""));
                }
                json.put("hint", z.j(z.p0(strI), ""));
                if (tag != null) {
                    json.put(s.z.f67720z, z.j(z.p0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    json.put("description", z.j(z.p0(contentDescription.toString()), ""));
                }
                json.put(TypedValues.Custom.S_DIMENSION, f95103a.e(view));
            } catch (JSONException e10) {
                z.Z(f95104b, e10);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
        }
    }

    public final boolean p(View view, View view2) {
        View viewL;
        if (e3.a.d(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") && (viewL = l(m(view), view2)) != null) {
                if (viewL.getId() == view.getId()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }
}
