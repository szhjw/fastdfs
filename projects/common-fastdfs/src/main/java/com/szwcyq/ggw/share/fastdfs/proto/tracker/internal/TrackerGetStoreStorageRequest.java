package com.szwcyq.ggw.share.fastdfs.proto.tracker.internal;

import com.szwcyq.ggw.share.fastdfs.proto.CmdConstants;
import com.szwcyq.ggw.share.fastdfs.proto.FdfsRequest;
import com.szwcyq.ggw.share.fastdfs.proto.ProtoHead;

/**
 * 获取存储节点请求
 * 
 * @author tobato
 *
 */
public class TrackerGetStoreStorageRequest extends FdfsRequest {

    private static final byte withoutGroupCmd = CmdConstants.TRACKER_PROTO_CMD_SERVICE_QUERY_STORE_WITHOUT_GROUP_ONE;

    /**
     * 获取存储节点
     * 
     * @param groupName
     */
    public TrackerGetStoreStorageRequest() {
        super();
        this.head = new ProtoHead(withoutGroupCmd);
    }

}
