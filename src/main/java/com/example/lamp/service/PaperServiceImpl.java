package com.example.lamp.service;

import com.example.lamp.dao.PaperDao;
import com.example.lamp.domain.Paper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PaperServiceImpl implements PaperService{
    private final PaperDao dao;

    int pageSize = 3;
    @Override
    public int createpaper(String title, String guidename, String prayname, String respname, String offername, String ccm1, String ccm2, String ccm3, String ccm4, String resp, String long_label, int chapter, int start, int fin, String notice, String notice1, String notice2, String notice3, String speachname, String nprayname, String nrespname, String noffername) {
        return dao.createpaper(title, guidename, prayname, respname, offername, ccm1, ccm2, ccm3, ccm4, resp, long_label, chapter, start, fin, notice, notice1, notice2, notice3, speachname, nprayname, nrespname, noffername);
    }

    @Override
    public List<Paper> getlist(int page) {

        int startRow = (page - 1) * pageSize;

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("startRow", startRow);
        paramMap.put("pageSize", pageSize);
        return dao.selectList(paramMap);
    }

    @Override
    public Paper paper(int idx) {
        return dao.paper(idx);
    }

    @Override
    public List<Paper> getbible(int idx) {
        return dao.getbible(idx);
    }

    @Override
    public int count() {
        return dao.count();
    }

    @Override
    public int getPageSize(){return pageSize;}

}
