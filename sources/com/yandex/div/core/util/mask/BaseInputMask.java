package com.yandex.div.core.util.mask;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C4240b4;
import com.yandex.div.core.util.mask.BaseInputMask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.g;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\b \u0018\u00002\u00020\u0001:\u0003YZ[B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000fH\u0004¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u000fH\u0004¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000fH\u0004¢\u0006\u0004\b,\u0010-J+\u0010/\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000fH\u0004¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b1\u00102J\u001b\u00106\u001a\u00020\u00162\n\u00105\u001a\u000603j\u0002`4H&¢\u0006\u0004\b6\u00107R$\u00109\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020?0=8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR(\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR*\u0010L\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000f8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0011\u0010T\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0014\u0010X\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bW\u0010O¨\u0006\\"}, d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask;", "", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;", "initialMaskData", "<init>", "(Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;)V", "Lcom/yandex/div/core/util/mask/TextDiff;", "textDiff", "", "newValue", "buildBodySubstring", "(Lcom/yandex/div/core/util/mask/TextDiff;Ljava/lang/String;)Ljava/lang/String;", "buildTailSubstring", "(Lcom/yandex/div/core/util/mask/TextDiff;)Ljava/lang/String;", TypedValues.Custom.S_STRING, "", "start", "calculateMaxShift", "(Ljava/lang/String;I)I", "newMaskData", "", "restoreValue", "", "updateMaskData", "(Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;Z)V", "newRawValue", "overrideRawValue", "(Ljava/lang/String;)V", C4240b4.i.L, "applyChangeFrom", "(Ljava/lang/String;Ljava/lang/Integer;)V", "replaceBodyTail", "(Lcom/yandex/div/core/util/mask/TextDiff;Ljava/lang/String;)I", "cleanup", "(Lcom/yandex/div/core/util/mask/TextDiff;)V", "end", "clearRange", "(II)V", "tailStart", "calculateCursorPosition", "(Lcom/yandex/div/core/util/mask/TextDiff;I)V", "substring", "calculateInsertableSubstring", "(Ljava/lang/String;I)Ljava/lang/String;", "collectValueRange", "(II)Ljava/lang/String;", "count", "replaceChars", "(Ljava/lang/String;ILjava/lang/Integer;)V", "firstHolderAfter", "(I)I", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "onException", "(Ljava/lang/Exception;)V", "<set-?>", "maskData", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;", "getMaskData", "()Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;", "", "", "Lkotlin/text/Regex;", "filters", "Ljava/util/Map;", "getFilters", "()Ljava/util/Map;", "", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar;", "destructedValue", "Ljava/util/List;", "getDestructedValue", "()Ljava/util/List;", "setDestructedValue", "(Ljava/util/List;)V", "cursorPosition", "I", "getCursorPosition", "()I", "setCursorPosition", "(I)V", "getRawValue", "()Ljava/lang/String;", "rawValue", "getValue", "value", "getFirstEmptyHolderIndex", "firstEmptyHolderIndex", "MaskChar", "MaskData", "MaskKey", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BaseInputMask {
    private int cursorPosition;
    protected List<? extends MaskChar> destructedValue;

    @NotNull
    private final Map<Character, Regex> filters = new LinkedHashMap();

    @NotNull
    private MaskData maskData;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar;", "", "()V", "Dynamic", "Static", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar$Dynamic;", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar$Static;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class MaskChar {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar$Dynamic;", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar;", "", "char", "Lkotlin/text/Regex;", "filter", "placeholder", "<init>", "(Ljava/lang/Character;Lkotlin/text/Regex;C)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Character;", "getChar", "()Ljava/lang/Character;", "setChar", "(Ljava/lang/Character;)V", "Lkotlin/text/Regex;", "getFilter", "()Lkotlin/text/Regex;", "C", "getPlaceholder", "()C", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Dynamic extends MaskChar {

            @Nullable
            private Character char;

            @Nullable
            private final Regex filter;
            private final char placeholder;

            public Dynamic(@Nullable Character ch2, @Nullable Regex regex, char c10) {
                super(null);
                this.char = ch2;
                this.filter = regex;
                this.placeholder = c10;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dynamic)) {
                    return false;
                }
                Dynamic dynamic = (Dynamic) other;
                return Intrinsics.areEqual(this.char, dynamic.char) && Intrinsics.areEqual(this.filter, dynamic.filter) && this.placeholder == dynamic.placeholder;
            }

            @Nullable
            public final Character getChar() {
                return this.char;
            }

            @Nullable
            public final Regex getFilter() {
                return this.filter;
            }

            public final char getPlaceholder() {
                return this.placeholder;
            }

            public int hashCode() {
                Character ch2 = this.char;
                int iHashCode = (ch2 == null ? 0 : ch2.hashCode()) * 31;
                Regex regex = this.filter;
                return ((iHashCode + (regex != null ? regex.hashCode() : 0)) * 31) + this.placeholder;
            }

            public final void setChar(@Nullable Character ch2) {
                this.char = ch2;
            }

            @NotNull
            public String toString() {
                return "Dynamic(char=" + this.char + ", filter=" + this.filter + ", placeholder=" + this.placeholder + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar$Static;", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar;", "", "char", "<init>", "(C)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "C", "getChar", "()C", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Static extends MaskChar {
            private final char char;

            public Static(char c10) {
                super(null);
                this.char = c10;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Static) && this.char == ((Static) other).char;
            }

            public final char getChar() {
                return this.char;
            }

            public int hashCode() {
                return this.char;
            }

            @NotNull
            public String toString() {
                return "Static(char=" + this.char + ')';
            }
        }

        public /* synthetic */ MaskChar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private MaskChar() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;", "", "", "pattern", "", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskKey;", "decoding", "", "alwaysVisible", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPattern", "Ljava/util/List;", "getDecoding", "()Ljava/util/List;", "Z", "getAlwaysVisible", "()Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class MaskData {
        private final boolean alwaysVisible;

        @NotNull
        private final List<MaskKey> decoding;

        @NotNull
        private final String pattern;

        public MaskData(@NotNull String str, @NotNull List<MaskKey> list, boolean z10) {
            this.pattern = str;
            this.decoding = list;
            this.alwaysVisible = z10;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MaskData)) {
                return false;
            }
            MaskData maskData = (MaskData) other;
            return Intrinsics.areEqual(this.pattern, maskData.pattern) && Intrinsics.areEqual(this.decoding, maskData.decoding) && this.alwaysVisible == maskData.alwaysVisible;
        }

        public final boolean getAlwaysVisible() {
            return this.alwaysVisible;
        }

        @NotNull
        public final List<MaskKey> getDecoding() {
            return this.decoding;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        public int hashCode() {
            int iHashCode = ((this.pattern.hashCode() * 31) + this.decoding.hashCode()) * 31;
            boolean z10 = this.alwaysVisible;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            return iHashCode + r12;
        }

        @NotNull
        public String toString() {
            return "MaskData(pattern=" + this.pattern + ", decoding=" + this.decoding + ", alwaysVisible=" + this.alwaysVisible + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskKey;", "", C4240b4.i.W, "", "filter", "", "placeholder", "(CLjava/lang/String;C)V", "getFilter", "()Ljava/lang/String;", "getKey", "()C", "getPlaceholder", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MaskKey {

        @Nullable
        private final String filter;
        private final char key;
        private final char placeholder;

        public MaskKey(char c10, @Nullable String str, char c11) {
            this.key = c10;
            this.filter = str;
            this.placeholder = c11;
        }

        @Nullable
        public final String getFilter() {
            return this.filter;
        }

        public final char getKey() {
            return this.key;
        }

        public final char getPlaceholder() {
            return this.placeholder;
        }
    }

    public BaseInputMask(@NotNull MaskData maskData) {
        this.maskData = maskData;
        updateMaskData$default(this, maskData, false, 2, null);
    }

    public static /* synthetic */ void applyChangeFrom$default(BaseInputMask baseInputMask, String str, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyChangeFrom");
        }
        if ((i10 & 2) != 0) {
            num = null;
        }
        baseInputMask.applyChangeFrom(str, num);
    }

    private final String buildBodySubstring(TextDiff textDiff, String newValue) {
        String strSubstring = newValue.substring(textDiff.getStart(), textDiff.getStart() + textDiff.getAdded());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final String buildTailSubstring(TextDiff textDiff) {
        return collectValueRange(textDiff.getStart() + textDiff.getRemoved(), getDestructedValue().size() - 1);
    }

    private final int calculateMaxShift(String string, int start) {
        int length;
        if (this.filters.size() <= 1) {
            int i10 = 0;
            while (start < getDestructedValue().size()) {
                if (getDestructedValue().get(start) instanceof MaskChar.Dynamic) {
                    i10++;
                }
                start++;
            }
            length = i10 - string.length();
        } else {
            String strCalculateInsertableSubstring = calculateInsertableSubstring(string, start);
            int i11 = 0;
            while (i11 < getDestructedValue().size() && Intrinsics.areEqual(strCalculateInsertableSubstring, calculateInsertableSubstring(string, start + i11))) {
                i11++;
            }
            length = i11 - 1;
        }
        return g.e(length, 0);
    }

    public static /* synthetic */ void replaceChars$default(BaseInputMask baseInputMask, String str, int i10, Integer num, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceChars");
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        baseInputMask.replaceChars(str, i10, num);
    }

    public static /* synthetic */ void updateMaskData$default(BaseInputMask baseInputMask, MaskData maskData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMaskData");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        baseInputMask.updateMaskData(maskData, z10);
    }

    public void applyChangeFrom(@NotNull String newValue, @Nullable Integer position) {
        TextDiff textDiffBuild = TextDiff.INSTANCE.build(getValue(), newValue);
        if (position != null) {
            textDiffBuild = new TextDiff(g.e(position.intValue() - textDiffBuild.getAdded(), 0), textDiffBuild.getAdded(), textDiffBuild.getRemoved());
        }
        calculateCursorPosition(textDiffBuild, replaceBodyTail(textDiffBuild, newValue));
    }

    protected final void calculateCursorPosition(@NotNull TextDiff textDiff, int tailStart) {
        int firstEmptyHolderIndex = getFirstEmptyHolderIndex();
        if (textDiff.getStart() < firstEmptyHolderIndex) {
            firstEmptyHolderIndex = Math.min(firstHolderAfter(tailStart), getValue().length());
        }
        this.cursorPosition = firstEmptyHolderIndex;
    }

    @NotNull
    protected final String calculateInsertableSubstring(@NotNull String substring, int start) {
        StringBuilder sb2 = new StringBuilder();
        final t0 t0Var = new t0();
        t0Var.f93331b = start;
        Function0<Regex> function0 = new Function0<Regex>() { // from class: com.yandex.div.core.util.mask.BaseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Regex invoke() {
                while (t0Var.f93331b < this.getDestructedValue().size() && !(this.getDestructedValue().get(t0Var.f93331b) instanceof BaseInputMask.MaskChar.Dynamic)) {
                    t0Var.f93331b++;
                }
                Object orNull = CollectionsKt.getOrNull(this.getDestructedValue(), t0Var.f93331b);
                BaseInputMask.MaskChar.Dynamic dynamic = orNull instanceof BaseInputMask.MaskChar.Dynamic ? (BaseInputMask.MaskChar.Dynamic) orNull : null;
                if (dynamic != null) {
                    return dynamic.getFilter();
                }
                return null;
            }
        };
        for (int i10 = 0; i10 < substring.length(); i10++) {
            char cCharAt = substring.charAt(i10);
            Regex regexInvoke = function0.invoke();
            if (regexInvoke != null && regexInvoke.g(String.valueOf(cCharAt))) {
                sb2.append(cCharAt);
                t0Var.f93331b++;
            }
        }
        return sb2.toString();
    }

    protected final void cleanup(@NotNull TextDiff textDiff) {
        if (textDiff.getAdded() == 0 && textDiff.getRemoved() == 1) {
            int start = textDiff.getStart();
            while (true) {
                if (start < 0) {
                    break;
                }
                MaskChar maskChar = getDestructedValue().get(start);
                if (maskChar instanceof MaskChar.Dynamic) {
                    MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                    if (dynamic.getChar() != null) {
                        dynamic.setChar(null);
                        break;
                    }
                }
                start--;
            }
        }
        clearRange(textDiff.getStart(), getDestructedValue().size());
    }

    protected final void clearRange(int start, int end) {
        while (start < end && start < getDestructedValue().size()) {
            MaskChar maskChar = getDestructedValue().get(start);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).setChar(null);
            }
            start++;
        }
    }

    @NotNull
    protected final String collectValueRange(int start, int end) {
        StringBuilder sb2 = new StringBuilder();
        while (start <= end) {
            MaskChar maskChar = getDestructedValue().get(start);
            if (maskChar instanceof MaskChar.Dynamic) {
                MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                if (dynamic.getChar() != null) {
                    sb2.append(dynamic.getChar());
                }
            }
            start++;
        }
        return sb2.toString();
    }

    protected final int firstHolderAfter(int start) {
        while (start < getDestructedValue().size() && !(getDestructedValue().get(start) instanceof MaskChar.Dynamic)) {
            start++;
        }
        return start;
    }

    public final int getCursorPosition() {
        return this.cursorPosition;
    }

    @NotNull
    protected final List<MaskChar> getDestructedValue() {
        List list = this.destructedValue;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("destructedValue");
        return null;
    }

    protected final int getFirstEmptyHolderIndex() {
        Iterator<MaskChar> it = getDestructedValue().iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            MaskChar next = it.next();
            if ((next instanceof MaskChar.Dynamic) && ((MaskChar.Dynamic) next).getChar() == null) {
                break;
            }
            i10++;
        }
        return i10 != -1 ? i10 : getDestructedValue().size();
    }

    @NotNull
    protected final MaskData getMaskData() {
        return this.maskData;
    }

    @NotNull
    public final String getRawValue() {
        return collectValueRange(0, getDestructedValue().size() - 1);
    }

    @NotNull
    public final String getValue() {
        StringBuilder sb2 = new StringBuilder();
        List<MaskChar> destructedValue = getDestructedValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : destructedValue) {
            MaskChar maskChar = (MaskChar) obj;
            if (!(maskChar instanceof MaskChar.Static)) {
                if (maskChar instanceof MaskChar.Dynamic) {
                    MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                    if (dynamic.getChar() != null) {
                        sb2.append(dynamic.getChar());
                    }
                }
                if (!this.maskData.getAlwaysVisible()) {
                    break;
                }
                Intrinsics.checkNotNull(maskChar, "null cannot be cast to non-null type com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Dynamic");
                sb2.append(((MaskChar.Dynamic) maskChar).getPlaceholder());
            } else {
                sb2.append(((MaskChar.Static) maskChar).getChar());
            }
            arrayList.add(obj);
        }
        return sb2.toString();
    }

    public abstract void onException(@NotNull Exception exception);

    public void overrideRawValue(@NotNull String newRawValue) {
        clearRange(0, getDestructedValue().size());
        replaceChars$default(this, newRawValue, 0, null, 4, null);
        this.cursorPosition = Math.min(this.cursorPosition, getValue().length());
    }

    protected final int replaceBodyTail(@NotNull TextDiff textDiff, @NotNull String newValue) {
        String strBuildBodySubstring = buildBodySubstring(textDiff, newValue);
        String strBuildTailSubstring = buildTailSubstring(textDiff);
        cleanup(textDiff);
        int firstEmptyHolderIndex = getFirstEmptyHolderIndex();
        replaceChars(strBuildBodySubstring, firstEmptyHolderIndex, strBuildTailSubstring.length() == 0 ? null : Integer.valueOf(calculateMaxShift(strBuildTailSubstring, firstEmptyHolderIndex)));
        int firstEmptyHolderIndex2 = getFirstEmptyHolderIndex();
        replaceChars$default(this, strBuildTailSubstring, firstEmptyHolderIndex2, null, 4, null);
        return firstEmptyHolderIndex2;
    }

    protected final void replaceChars(@NotNull String substring, int start, @Nullable Integer count) {
        String strCalculateInsertableSubstring = calculateInsertableSubstring(substring, start);
        if (count != null) {
            strCalculateInsertableSubstring = StringsKt.J1(strCalculateInsertableSubstring, count.intValue());
        }
        int i10 = 0;
        while (start < getDestructedValue().size() && i10 < strCalculateInsertableSubstring.length()) {
            MaskChar maskChar = getDestructedValue().get(start);
            char cCharAt = strCalculateInsertableSubstring.charAt(i10);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).setChar(Character.valueOf(cCharAt));
                i10++;
            }
            start++;
        }
    }

    protected final void setCursorPosition(int i10) {
        this.cursorPosition = i10;
    }

    protected final void setDestructedValue(@NotNull List<? extends MaskChar> list) {
        this.destructedValue = list;
    }

    public void updateMaskData(@NotNull MaskData newMaskData, boolean restoreValue) {
        Object next;
        String rawValue = (Intrinsics.areEqual(this.maskData, newMaskData) || !restoreValue) ? null : getRawValue();
        this.maskData = newMaskData;
        this.filters.clear();
        for (MaskKey maskKey : this.maskData.getDecoding()) {
            try {
                String filter = maskKey.getFilter();
                if (filter != null) {
                    this.filters.put(Character.valueOf(maskKey.getKey()), new Regex(filter));
                }
            } catch (PatternSyntaxException e10) {
                onException(e10);
            }
        }
        String pattern = this.maskData.getPattern();
        ArrayList arrayList = new ArrayList(pattern.length());
        for (int i10 = 0; i10 < pattern.length(); i10++) {
            char cCharAt = pattern.charAt(i10);
            Iterator<T> it = this.maskData.getDecoding().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((MaskKey) next).getKey() == cCharAt) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            MaskKey maskKey2 = (MaskKey) next;
            arrayList.add(maskKey2 != null ? new MaskChar.Dynamic(null, this.filters.get(Character.valueOf(maskKey2.getKey())), maskKey2.getPlaceholder()) : new MaskChar.Static(cCharAt));
        }
        setDestructedValue(arrayList);
        if (rawValue != null) {
            overrideRawValue(rawValue);
        }
    }
}
