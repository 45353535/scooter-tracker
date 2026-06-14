package com.yandex.div.core.resources;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\t\u001a\u00020\b2\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u0001H\u0017¢\u0006\u0004\b\u0010\u0010\u0014J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u0001H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0016\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u0001H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b \u0010\"J!\u0010$\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH\u0017¢\u0006\u0004\b$\u0010%J/\u0010$\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0018\u00010\u0012R\u00020\u0001H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b+\u0010,J'\u0010/\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u00100J-\u00105\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u0001012\b\u00103\u001a\u0004\u0018\u0001012\b\u00104\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b:\u0010\u000fJ\u0019\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b<\u0010=J7\u0010A\u001a\u0002012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b2\u0016\u0010@\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010?0\u0005\"\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010A\u001a\u0002012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000bH\u0016¢\u0006\u0004\bA\u0010CJ\u001f\u0010E\u001a\u00020D2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000bH\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u0004\u0018\u0001012\u0006\u0010G\u001a\u00020\u000bH\u0016¢\u0006\u0004\bH\u0010IJ\u0019\u0010J\u001a\u0004\u0018\u0001012\u0006\u0010G\u001a\u00020\u000bH\u0016¢\u0006\u0004\bJ\u0010IJ\u0019\u0010K\u001a\u0004\u0018\u0001012\u0006\u0010G\u001a\u00020\u000bH\u0016¢\u0006\u0004\bK\u0010IJ\u0019\u0010L\u001a\u0004\u0018\u0001012\u0006\u0010G\u001a\u00020\u000bH\u0016¢\u0006\u0004\bL\u0010IJ/\u0010M\u001a\u0002012\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010@\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010?0\u0005\"\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010M\u001a\u0002012\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bM\u0010IJ\u001f\u0010O\u001a\n\u0012\u0006\b\u0001\u0012\u0002010\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bO\u0010PJ#\u0010R\u001a\u0004\u0018\u00010D2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010Q\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010R\u001a\u00020D2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bR\u0010TJ\u001f\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00020D0\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bU\u0010VJ+\u0010[\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u0001012\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J)\u0010[\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010]J1\u0010^\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b`\u0010\u000fJ%\u0010e\u001a\u0004\u0018\u00010d2\b\u0010b\u001a\u0004\u0018\u00010a2\b\u0010c\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010g\u001a\u00020d2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bg\u0010hJ!\u0010k\u001a\u00020j2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010i\u001a\u0004\u0018\u00010WH\u0016¢\u0006\u0004\bk\u0010lJ\u0017\u0010k\u001a\u00020j2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bk\u0010mJ\u0019\u0010o\u001a\u0004\u0018\u00010n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bo\u0010pJ-\u0010t\u001a\u00020\b2\b\u0010q\u001a\u0004\u0018\u0001012\b\u0010c\u001a\u0004\u0018\u00010a2\b\u0010s\u001a\u0004\u0018\u00010rH\u0016¢\u0006\u0004\bt\u0010uJ#\u0010w\u001a\u00020\b2\b\u0010v\u001a\u0004\u0018\u00010\r2\b\u0010s\u001a\u0004\u0018\u00010rH\u0016¢\u0006\u0004\bw\u0010xJ'\u0010y\u001a\u00020\b2\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\by\u0010\nJ#\u0010|\u001a\u00020\b2\b\u0010z\u001a\u0004\u0018\u00010\u00192\b\u0010{\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b|\u0010}R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010~¨\u0006\u007f"}, d2 = {"Lcom/yandex/div/core/resources/ResourcesWrapper;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "", "Landroid/content/res/loader/ResourcesLoader;", "loaders", "", "addLoaders", "([Landroid/content/res/loader/ResourcesLoader;)V", "", "id", "Landroid/content/res/XmlResourceParser;", "getAnimation", "(I)Landroid/content/res/XmlResourceParser;", "getColor", "(I)I", "Landroid/content/res/Resources$Theme;", "theme", "(ILandroid/content/res/Resources$Theme;)I", "Landroid/content/res/ColorStateList;", "getColorStateList", "(ILandroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;", "(I)Landroid/content/res/ColorStateList;", "Landroid/content/res/Configuration;", "getConfiguration", "()Landroid/content/res/Configuration;", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "Landroid/graphics/drawable/Drawable;", "getDrawable", "(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;", "(I)Landroid/graphics/drawable/Drawable;", "density", "getDrawableForDensity", "(II)Landroid/graphics/drawable/Drawable;", "(IILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;", "", "getFloat", "(I)F", "Landroid/graphics/Typeface;", "getFont", "(I)Landroid/graphics/Typeface;", "base", "pbase", "getFraction", "(III)F", "", "name", "defType", "defPackage", "getIdentifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I", "", "getIntArray", "(I)[I", "getLayout", "Landroid/graphics/Movie;", "getMovie", "(I)Landroid/graphics/Movie;", FirebaseAnalytics.Param.QUANTITY, "", "formatArgs", "getQuantityString", "(II[Ljava/lang/Object;)Ljava/lang/String;", "(II)Ljava/lang/String;", "", "getQuantityText", "(II)Ljava/lang/CharSequence;", "resid", "getResourceEntryName", "(I)Ljava/lang/String;", "getResourceName", "getResourcePackageName", "getResourceTypeName", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "(I)[Ljava/lang/String;", "def", "getText", "(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "(I)Ljava/lang/CharSequence;", "getTextArray", "(I)[Ljava/lang/CharSequence;", "Landroid/util/TypedValue;", "outValue", "", "resolveRefs", "getValue", "(Ljava/lang/String;Landroid/util/TypedValue;Z)V", "(ILandroid/util/TypedValue;Z)V", "getValueForDensity", "(IILandroid/util/TypedValue;Z)V", "getXml", "Landroid/util/AttributeSet;", "set", "attrs", "Landroid/content/res/TypedArray;", "obtainAttributes", "(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "obtainTypedArray", "(I)Landroid/content/res/TypedArray;", "value", "Ljava/io/InputStream;", "openRawResource", "(ILandroid/util/TypedValue;)Ljava/io/InputStream;", "(I)Ljava/io/InputStream;", "Landroid/content/res/AssetFileDescriptor;", "openRawResourceFd", "(I)Landroid/content/res/AssetFileDescriptor;", "tagName", "Landroid/os/Bundle;", "outBundle", "parseBundleExtra", "(Ljava/lang/String;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "parser", "parseBundleExtras", "(Landroid/content/res/XmlResourceParser;Landroid/os/Bundle;)V", "removeLoaders", "config", "metrics", "updateConfiguration", "(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V", "Landroid/content/res/Resources;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ResourcesWrapper extends Resources {

    @NotNull
    private final Resources resources;

    public ResourcesWrapper(@NotNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.resources = resources;
    }

    @Override // android.content.res.Resources
    @RequiresApi(30)
    public void addLoaders(@NotNull ResourcesLoader... loaders) {
        this.resources.addLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getAnimation(int id2) throws Resources.NotFoundException {
        return this.resources.getAnimation(id2);
    }

    @Override // android.content.res.Resources
    public int getColor(int id2) throws Resources.NotFoundException {
        return this.resources.getColor(id2);
    }

    @Override // android.content.res.Resources
    @RequiresApi(23)
    @NotNull
    public ColorStateList getColorStateList(int id2, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getColorStateList(id2, theme);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Configuration getConfiguration() {
        return this.resources.getConfiguration();
    }

    @Override // android.content.res.Resources
    @Nullable
    public DisplayMetrics getDisplayMetrics() {
        return this.resources.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawable(int id2, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getDrawable(id2, theme);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int id2, int density) throws Resources.NotFoundException {
        return this.resources.getDrawableForDensity(id2, density);
    }

    @Override // android.content.res.Resources
    @RequiresApi(29)
    public float getFloat(int id2) throws Resources.NotFoundException {
        return this.resources.getFloat(id2);
    }

    @Override // android.content.res.Resources
    @RequiresApi(26)
    @NotNull
    public Typeface getFont(int id2) throws Resources.NotFoundException {
        return this.resources.getFont(id2);
    }

    @Override // android.content.res.Resources
    public float getFraction(int id2, int base, int pbase) throws Resources.NotFoundException {
        return this.resources.getFraction(id2, base, pbase);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(@Nullable String name, @Nullable String defType, @Nullable String defPackage) {
        return this.resources.getIdentifier(name, defType, defPackage);
    }

    @Override // android.content.res.Resources
    @NotNull
    public int[] getIntArray(int id2) throws Resources.NotFoundException {
        return this.resources.getIntArray(id2);
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getLayout(int id2) throws Resources.NotFoundException {
        return this.resources.getLayout(id2);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Movie getMovie(int id2) throws Resources.NotFoundException {
        return this.resources.getMovie(id2);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getQuantityString(int id2, int quantity, @NotNull Object... formatArgs) throws Resources.NotFoundException {
        return this.resources.getQuantityString(id2, quantity, Arrays.copyOf(formatArgs, formatArgs.length));
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getQuantityText(int id2, int quantity) throws Resources.NotFoundException {
        return this.resources.getQuantityText(id2, quantity);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceEntryName(int resid) throws Resources.NotFoundException {
        return this.resources.getResourceEntryName(resid);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceName(int resid) throws Resources.NotFoundException {
        return this.resources.getResourceName(resid);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourcePackageName(int resid) throws Resources.NotFoundException {
        return this.resources.getResourcePackageName(resid);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceTypeName(int resid) throws Resources.NotFoundException {
        return this.resources.getResourceTypeName(resid);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int id2, @NotNull Object... formatArgs) throws Resources.NotFoundException {
        return this.resources.getString(id2, Arrays.copyOf(formatArgs, formatArgs.length));
    }

    @Override // android.content.res.Resources
    @NotNull
    public String[] getStringArray(int id2) throws Resources.NotFoundException {
        return this.resources.getStringArray(id2);
    }

    @Override // android.content.res.Resources
    @Nullable
    public CharSequence getText(int id2, @Nullable CharSequence def) {
        return this.resources.getText(id2, def);
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence[] getTextArray(int id2) throws Resources.NotFoundException {
        return this.resources.getTextArray(id2);
    }

    @Override // android.content.res.Resources
    public void getValue(@Nullable String name, @Nullable TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException {
        this.resources.getValue(name, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int id2, int density, @Nullable TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException {
        this.resources.getValueForDensity(id2, density, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getXml(int id2) throws Resources.NotFoundException {
        return this.resources.getXml(id2);
    }

    @Override // android.content.res.Resources
    @Nullable
    public TypedArray obtainAttributes(@Nullable AttributeSet set, @Nullable int[] attrs) {
        return this.resources.obtainAttributes(set, attrs);
    }

    @Override // android.content.res.Resources
    @NotNull
    public TypedArray obtainTypedArray(int id2) throws Resources.NotFoundException {
        return this.resources.obtainTypedArray(id2);
    }

    @Override // android.content.res.Resources
    @NotNull
    public InputStream openRawResource(int id2, @Nullable TypedValue value) throws Resources.NotFoundException {
        return this.resources.openRawResource(id2, value);
    }

    @Override // android.content.res.Resources
    @Nullable
    public AssetFileDescriptor openRawResourceFd(int id2) throws Resources.NotFoundException {
        return this.resources.openRawResourceFd(id2);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(@Nullable String tagName, @Nullable AttributeSet attrs, @Nullable Bundle outBundle) throws XmlPullParserException {
        this.resources.parseBundleExtra(tagName, attrs, outBundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(@Nullable XmlResourceParser parser, @Nullable Bundle outBundle) throws XmlPullParserException, IOException {
        this.resources.parseBundleExtras(parser, outBundle);
    }

    @Override // android.content.res.Resources
    @RequiresApi(30)
    public void removeLoaders(@NotNull ResourcesLoader... loaders) {
        this.resources.removeLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(@Nullable Configuration config, @Nullable DisplayMetrics metrics) {
        super.updateConfiguration(config, metrics);
        Resources resources = this.resources;
        if (resources != null) {
            resources.updateConfiguration(config, metrics);
        }
    }

    @Override // android.content.res.Resources
    @RequiresApi(23)
    public int getColor(int id2, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getColor(id2, theme);
    }

    @Override // android.content.res.Resources
    @NotNull
    public ColorStateList getColorStateList(int id2) throws Resources.NotFoundException {
        return this.resources.getColorStateList(id2);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawable(int id2) throws Resources.NotFoundException {
        return this.resources.getDrawable(id2);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int id2, int density, @Nullable Resources.Theme theme) {
        return this.resources.getDrawableForDensity(id2, density, theme);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getQuantityString(int id2, int quantity) throws Resources.NotFoundException {
        return this.resources.getQuantityString(id2, quantity);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int id2) throws Resources.NotFoundException {
        return this.resources.getString(id2);
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getText(int id2) throws Resources.NotFoundException {
        return this.resources.getText(id2);
    }

    @Override // android.content.res.Resources
    public void getValue(int id2, @Nullable TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException {
        this.resources.getValue(id2, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    @NotNull
    public InputStream openRawResource(int id2) throws Resources.NotFoundException {
        return this.resources.openRawResource(id2);
    }
}
