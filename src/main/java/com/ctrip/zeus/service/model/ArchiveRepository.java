package com.ctrip.zeus.service.model;

import com.ctrip.zeus.model.entity.Group;
import com.ctrip.zeus.model.entity.Slb;
import com.ctrip.zeus.model.entity.VirtualServer;

/**
 * Created by zhoumy on 2016/5/17.
 */
public interface ArchiveRepository {

    void archiveGroup(Group group) throws Exception;

    void archiveSlb(Slb slb) throws Exception;

    void archiveVs(VirtualServer vs) throws Exception;

    Group getGroupArchive(Long id) throws Exception;

    Slb getSlbArchive(Long id) throws Exception;

    VirtualServer getVsArchive(Long id) throws Exception;
}
