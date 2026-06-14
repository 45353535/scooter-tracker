package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.source.rtsp.RtpPacketReorderingQueue;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes7.dex */
final class RtpPacketReorderingQueue {

    @VisibleForTesting
    static final int MAX_SEQUENCE_LEAP_ALLOWED = 1000;
    private static final int QUEUE_SIZE_THRESHOLD_FOR_RESET = 5000;

    @GuardedBy("this")
    private int lastDequeuedSequenceNumber;

    @GuardedBy("this")
    private int lastReceivedSequenceNumber;

    @GuardedBy("this")
    private final TreeSet<RtpPacketContainer> packetQueue = new TreeSet<>(new Comparator() { // from class: com.google.android.exoplayer2.source.rtsp.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return RtpPacketReorderingQueue.calculateSequenceNumberShift(((RtpPacketReorderingQueue.RtpPacketContainer) obj).packet.sequenceNumber, ((RtpPacketReorderingQueue.RtpPacketContainer) obj2).packet.sequenceNumber);
        }
    });

    @GuardedBy("this")
    private boolean started;

    /* JADX INFO: Access modifiers changed from: private */
    static final class RtpPacketContainer {
        public final RtpPacket packet;
        public final long receivedTimestampMs;

        public RtpPacketContainer(RtpPacket rtpPacket, long j10) {
            this.packet = rtpPacket;
            this.receivedTimestampMs = j10;
        }
    }

    public RtpPacketReorderingQueue() {
        reset();
    }

    private synchronized void addToQueue(RtpPacketContainer rtpPacketContainer) {
        this.lastReceivedSequenceNumber = rtpPacketContainer.packet.sequenceNumber;
        this.packetQueue.add(rtpPacketContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int calculateSequenceNumberShift(int i10, int i11) {
        int iMin;
        int i12 = i10 - i11;
        return (Math.abs(i12) <= 1000 || (iMin = (Math.min(i10, i11) - Math.max(i10, i11)) + 65535) >= 1000) ? i12 : i10 < i11 ? iMin : -iMin;
    }

    public synchronized boolean offer(RtpPacket rtpPacket, long j10) {
        if (this.packetQueue.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i10 = rtpPacket.sequenceNumber;
        if (!this.started) {
            reset();
            this.lastDequeuedSequenceNumber = RtpPacket.getPreviousSequenceNumber(i10);
            this.started = true;
            addToQueue(new RtpPacketContainer(rtpPacket, j10));
            return true;
        }
        if (Math.abs(calculateSequenceNumberShift(i10, RtpPacket.getNextSequenceNumber(this.lastReceivedSequenceNumber))) < 1000) {
            if (calculateSequenceNumberShift(i10, this.lastDequeuedSequenceNumber) <= 0) {
                return false;
            }
            addToQueue(new RtpPacketContainer(rtpPacket, j10));
            return true;
        }
        this.lastDequeuedSequenceNumber = RtpPacket.getPreviousSequenceNumber(i10);
        this.packetQueue.clear();
        addToQueue(new RtpPacketContainer(rtpPacket, j10));
        return true;
    }

    @Nullable
    public synchronized RtpPacket poll(long j10) {
        if (this.packetQueue.isEmpty()) {
            return null;
        }
        RtpPacketContainer rtpPacketContainerFirst = this.packetQueue.first();
        int i10 = rtpPacketContainerFirst.packet.sequenceNumber;
        if (i10 != RtpPacket.getNextSequenceNumber(this.lastDequeuedSequenceNumber) && j10 < rtpPacketContainerFirst.receivedTimestampMs) {
            return null;
        }
        this.packetQueue.pollFirst();
        this.lastDequeuedSequenceNumber = i10;
        return rtpPacketContainerFirst.packet;
    }

    public synchronized void reset() {
        this.packetQueue.clear();
        this.started = false;
        this.lastDequeuedSequenceNumber = -1;
        this.lastReceivedSequenceNumber = -1;
    }
}
