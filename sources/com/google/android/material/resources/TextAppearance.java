package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TextAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ColorStateList f27274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f27275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27277d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27278e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Typeface f27279f;

    @Nullable
    public final String fontFamily;

    @Nullable
    public String fontVariationSettings;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;

    @Nullable
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;

    @Nullable
    public final ColorStateList textColorHint;

    @Nullable
    public final ColorStateList textColorLink;
    public final int textStyle;
    public final int typeface;

    public TextAppearance(@NonNull Context context, @StyleRes int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, R.styleable.TextAppearance);
        setTextSize(typedArrayObtainStyledAttributes.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f));
        setTextColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.TextAppearance_android_textColor));
        this.textColorHint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.TextAppearance_android_textColorHint);
        this.textColorLink = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.TextAppearance_android_textColorLink);
        this.textStyle = typedArrayObtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, 0);
        this.typeface = typedArrayObtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, 1);
        int iB = MaterialResources.b(typedArrayObtainStyledAttributes, R.styleable.TextAppearance_fontFamily, R.styleable.TextAppearance_android_fontFamily);
        this.f27276c = typedArrayObtainStyledAttributes.getResourceId(iB, 0);
        this.fontFamily = typedArrayObtainStyledAttributes.getString(iB);
        this.textAllCaps = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        this.shadowColor = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.TextAppearance_android_shadowColor);
        this.shadowDx = typedArrayObtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.shadowDy = typedArrayObtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.shadowRadius = typedArrayObtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, com.google.android.material.R.styleable.MaterialTextAppearance);
        int i11 = com.google.android.material.R.styleable.MaterialTextAppearance_android_letterSpacing;
        this.hasLetterSpacing = typedArrayObtainStyledAttributes2.hasValue(i11);
        this.letterSpacing = typedArrayObtainStyledAttributes2.getFloat(i11, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.fontVariationSettings = typedArrayObtainStyledAttributes2.getString(MaterialResources.b(typedArrayObtainStyledAttributes2, com.google.android.material.R.styleable.MaterialTextAppearance_fontVariationSettings, com.google.android.material.R.styleable.MaterialTextAppearance_android_fontVariationSettings));
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f27279f == null && (str = this.fontFamily) != null) {
            this.f27279f = Typeface.create(str, this.textStyle);
        }
        if (this.f27279f == null) {
            int i10 = this.typeface;
            if (i10 == 1) {
                this.f27279f = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f27279f = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f27279f = Typeface.DEFAULT;
            } else {
                this.f27279f = Typeface.MONOSPACE;
            }
            this.f27279f = Typeface.create(this.f27279f, this.textStyle);
        }
    }

    private Typeface e(Context context) {
        Typeface typefaceCreate;
        if (this.f27278e) {
            return null;
        }
        this.f27278e = true;
        String strG = g(context, this.f27276c);
        if (strG == null || (typefaceCreate = Typeface.create(strG, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(typefaceCreate, this.textStyle);
    }

    private boolean f(Context context) {
        if (TextAppearanceConfig.shouldLoadFontSynchronously()) {
            getFont(context);
            return true;
        }
        if (this.f27277d) {
            return true;
        }
        int i10 = this.f27276c;
        if (i10 == 0) {
            return false;
        }
        Typeface cachedFont = ResourcesCompat.getCachedFont(context, i10);
        if (cachedFont != null) {
            this.f27279f = cachedFont;
            this.f27277d = true;
            return true;
        }
        Typeface typefaceE = e(context);
        if (typefaceE == null) {
            return false;
        }
        this.f27279f = typefaceE;
        this.f27277d = true;
        return true;
    }

    private static String g(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 != 0 && resources.getResourceTypeName(i10).equals("font")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), androidx.core.R.styleable.FontFamily);
                        String string = typedArrayObtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderSystemFontFamily);
                        typedArrayObtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public Typeface getFallbackFont() {
        d();
        return this.f27279f;
    }

    @NonNull
    @VisibleForTesting
    public Typeface getFont(@NonNull Context context) {
        if (this.f27277d) {
            return this.f27279f;
        }
        if (!context.isRestricted()) {
            try {
                Typeface font = ResourcesCompat.getFont(context, this.f27276c);
                this.f27279f = font;
                if (font != null) {
                    this.f27279f = Typeface.create(font, this.textStyle);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.fontFamily, e10);
            }
        }
        d();
        this.f27277d = true;
        return this.f27279f;
    }

    public void getFontAsync(@NonNull Context context, @NonNull final TextAppearanceFontCallback textAppearanceFontCallback) {
        if (!f(context)) {
            d();
        }
        int i10 = this.f27276c;
        if (i10 == 0) {
            this.f27277d = true;
        }
        if (this.f27277d) {
            textAppearanceFontCallback.onFontRetrieved(this.f27279f, true);
            return;
        }
        try {
            ResourcesCompat.getFont(context, i10, new ResourcesCompat.FontCallback() { // from class: com.google.android.material.resources.TextAppearance.1
                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                public void onFontRetrievalFailed(int i11) {
                    TextAppearance.this.f27277d = true;
                    textAppearanceFontCallback.onFontRetrievalFailed(i11);
                }

                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                public void onFontRetrieved(@NonNull Typeface typeface) {
                    TextAppearance textAppearance = TextAppearance.this;
                    textAppearance.f27279f = Typeface.create(typeface, textAppearance.textStyle);
                    TextAppearance.this.f27277d = true;
                    textAppearanceFontCallback.onFontRetrieved(TextAppearance.this.f27279f, false);
                }
            }, null);
        } catch (Resources.NotFoundException unused) {
            this.f27277d = true;
            textAppearanceFontCallback.onFontRetrievalFailed(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.fontFamily, e10);
            this.f27277d = true;
            textAppearanceFontCallback.onFontRetrievalFailed(-3);
        }
    }

    @Nullable
    @RequiresApi(26)
    public String getFontVariationSettings() {
        return this.fontVariationSettings;
    }

    @Nullable
    public ColorStateList getTextColor() {
        return this.f27274a;
    }

    public float getTextSize() {
        return this.f27275b;
    }

    @RequiresApi(26)
    public void setFontVariationSettings(@Nullable String str) {
        this.fontVariationSettings = str;
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        this.f27274a = colorStateList;
    }

    public void setTextSize(float f10) {
        this.f27275b = f10;
    }

    public void updateDrawState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        updateMeasureState(context, textPaint, textAppearanceFontCallback);
        ColorStateList colorStateList = this.f27274a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : ViewCompat.MEASURED_STATE_MASK);
        float f10 = this.shadowRadius;
        float f11 = this.shadowDx;
        float f12 = this.shadowDy;
        ColorStateList colorStateList2 = this.shadowColor;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void updateMeasureState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        Typeface typeface;
        if (f(context) && this.f27277d && (typeface = this.f27279f) != null) {
            updateTextPaintMeasureState(context, textPaint, typeface);
        } else {
            getFontAsync(context, textPaint, textAppearanceFontCallback);
        }
    }

    public void updateTextPaintMeasureState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(context, typeface);
        if (typefaceMaybeCopyWithFontWeightAdjustment != null) {
            typeface = typefaceMaybeCopyWithFontWeightAdjustment;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.textStyle & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f27275b);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.fontVariationSettings);
        }
        if (this.hasLetterSpacing) {
            textPaint.setLetterSpacing(this.letterSpacing);
        }
    }

    public void getFontAsync(@NonNull final Context context, @NonNull final TextPaint textPaint, @NonNull final TextAppearanceFontCallback textAppearanceFontCallback) {
        updateTextPaintMeasureState(context, textPaint, getFallbackFont());
        getFontAsync(context, new TextAppearanceFontCallback() { // from class: com.google.android.material.resources.TextAppearance.2
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrievalFailed(int i10) {
                textAppearanceFontCallback.onFontRetrievalFailed(i10);
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrieved(@NonNull Typeface typeface, boolean z10) {
                TextAppearance.this.updateTextPaintMeasureState(context, textPaint, typeface);
                textAppearanceFontCallback.onFontRetrieved(typeface, z10);
            }
        });
    }
}
