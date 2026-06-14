package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface MemberDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility {
    @NotNull
    Modality getModality();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    DescriptorVisibility getVisibility();

    boolean isActual();

    boolean isExpect();

    boolean isExternal();
}
