package com.bimils.myapp.common.fileitem.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bimils.myapp.common.fileitem.model.FileItem;


@Mapper
public interface FileItemMapper {
	
	public List<FileItem> selectFileItemList( Map<String, Object> paramMap) throws Exception;
	
	public FileItem selectFileItem(Map<String, Object> paramMap) throws Exception;
	
	public int insertFileItems(FileItem fileItem) throws Exception;
	
	public int deleteFileItems(Map<String, Object> paramMap) throws Exception;
	
	public int updateDownloadCnt(Map<String, Object> paramMap) throws Exception;
	
	
}
