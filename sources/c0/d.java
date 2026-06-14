package c0;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Xml;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {
    public static final Drawable a(Context context, int i10) {
        Drawable drawable = AppCompatResources.getDrawable(context, i10);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final Drawable b(Resources resources, int i10, Resources.Theme theme) {
        Drawable drawable = ResourcesCompat.getDrawable(resources, i10, theme);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final Lifecycle c(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof LifecycleOwner)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((LifecycleOwner) baseContext).getLifecycle();
    }

    public static final Drawable d(Context context, Resources resources, int i10) throws XmlPullParserException, IOException {
        XmlResourceParser xml = resources.getXml(i10);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found.");
        }
        if (Build.VERSION.SDK_INT < 24) {
            String name = xml.getName();
            if (Intrinsics.areEqual(name, "vector")) {
                return VectorDrawableCompat.createFromXmlInner(resources, (XmlPullParser) xml, Xml.asAttributeSet(xml), context.getTheme());
            }
            if (Intrinsics.areEqual(name, "animated-vector")) {
                return AnimatedVectorDrawableCompat.createFromXmlInner(context, resources, xml, Xml.asAttributeSet(xml), context.getTheme());
            }
        }
        return b(resources, i10, context.getTheme());
    }

    public static final boolean e(Context context, String str) {
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }
}
