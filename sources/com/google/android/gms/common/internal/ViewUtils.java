package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class ViewUtils {
    private ViewUtils() {
    }

    @Nullable
    @KeepForSdk
    public static String getXmlAttributeString(@NonNull String str, @NonNull String str2, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z10, boolean z11, @NonNull String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z10) {
            String strSubstring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 8 + String.valueOf(strSubstring).length());
                sb2.append(packageName);
                sb2.append(":string/");
                sb2.append(strSubstring);
                resources.getValue(sb2.toString(), typedValue, true);
            } catch (Resources.NotFoundException unused) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 30 + attributeValue.length());
                sb3.append("Could not find resource for ");
                sb3.append(str2);
                sb3.append(": ");
                sb3.append(attributeValue);
                Log.w(str3, sb3.toString());
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                attributeValue = charSequence.toString();
            } else {
                String string = typedValue.toString();
                StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 28 + string.length());
                sb4.append("Resource ");
                sb4.append(str2);
                sb4.append(" was not a string: ");
                sb4.append(string);
                Log.w(str3, sb4.toString());
            }
        }
        if (z11 && attributeValue == null) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 33);
            sb5.append("Required XML attribute \"");
            sb5.append(str2);
            sb5.append("\" missing");
            Log.w(str3, sb5.toString());
        }
        return attributeValue;
    }
}
