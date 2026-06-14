package com.yandex.div.core.util.mask;

import com.ironsource.C4240b4;
import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.util.mask.TextDiff;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0014\u0010\u0012\u001a\u00020\u00062\n\u0010\u0013\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\nH\u0002R\u001e\u0010\u0002\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/util/mask/PhoneInputMask;", "Lcom/yandex/div/core/util/mask/BaseInputMask;", "onError", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "(Lkotlin/jvm/functions/Function1;)V", "applyChangeFrom", "newValue", "", C4240b4.i.L, "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "calculateCursorPositionBy", "dynamicDestination", "newMaskPatternFor", "rawValue", "onException", "exception", "overrideRawValue", "newRawValue", "tryInvalidateMaskDataWith", "(Ljava/lang/String;)Lkotlin/Unit;", "updateMaskDataWith", "newPattern", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PhoneInputMask extends BaseInputMask {

    @NotNull
    private final Function1<Exception, Unit> onError;

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneInputMask(@NotNull Function1<? super Exception, Unit> function1) {
        super(PhoneInputMaskKt.getDEFAULT_MASK_DATA());
        this.onError = function1;
    }

    private final void calculateCursorPositionBy(int dynamicDestination) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < getDestructedValue().size() && i11 < dynamicDestination) {
            int i12 = i10 + 1;
            if (getDestructedValue().get(i10) instanceof BaseInputMask.MaskChar.Dynamic) {
                i11++;
            }
            i10 = i12;
        }
        setCursorPosition(firstHolderAfter(i10));
    }

    private final String newMaskPatternFor(String rawValue) throws JSONException {
        String phoneMaskPattern = PhoneInputMaskKt.getPhoneMaskPattern(rawValue);
        if (Intrinsics.areEqual(phoneMaskPattern, getMaskData().getPattern())) {
            return null;
        }
        return phoneMaskPattern;
    }

    private final Unit tryInvalidateMaskDataWith(String rawValue) throws JSONException {
        String strNewMaskPatternFor = newMaskPatternFor(rawValue);
        if (strNewMaskPatternFor == null) {
            return null;
        }
        updateMaskDataWith(strNewMaskPatternFor);
        return Unit.f93236a;
    }

    private final void updateMaskDataWith(String newPattern) {
        updateMaskData(new BaseInputMask.MaskData(newPattern, PhoneInputMaskKt.getDEFAULT_DECODING_MASK_KEY(), getMaskData().getAlwaysVisible()), false);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void applyChangeFrom(@NotNull String newValue, @Nullable Integer position) throws JSONException {
        TextDiff.Companion companion = TextDiff.INSTANCE;
        TextDiff textDiffBuild = companion.build(getValue(), newValue);
        if (position != null) {
            textDiffBuild = new TextDiff(g.e(position.intValue() - textDiffBuild.getAdded(), 0), textDiffBuild.getAdded(), textDiffBuild.getRemoved());
        }
        String rawValue = getRawValue();
        int iReplaceBodyTail = replaceBodyTail(textDiffBuild, newValue);
        String rawValue2 = getRawValue();
        String strNewMaskPatternFor = newMaskPatternFor(rawValue2);
        if (strNewMaskPatternFor == null) {
            calculateCursorPosition(textDiffBuild, iReplaceBodyTail);
            return;
        }
        updateMaskDataWith(strNewMaskPatternFor);
        BaseInputMask.replaceChars$default(this, rawValue2, 0, null, 4, null);
        TextDiff textDiffBuild2 = companion.build(rawValue, rawValue2);
        calculateCursorPositionBy(textDiffBuild2.getStart() + textDiffBuild2.getAdded());
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(@NotNull Exception exception) {
        this.onError.invoke(exception);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void overrideRawValue(@NotNull String newRawValue) throws JSONException {
        tryInvalidateMaskDataWith(newRawValue);
        super.overrideRawValue(newRawValue);
    }
}
