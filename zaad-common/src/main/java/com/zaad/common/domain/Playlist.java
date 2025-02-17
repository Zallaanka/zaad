package com.zaad.common.domain;

import com.zaad.common.ZaadDomain;
import com.zaad.common.parser.VideoLineParser;
import com.zaad.common.parser.ZaadLineParser;

import java.util.List;

/**
 * @author socurites, lks21c
 */
public class Playlist extends ZaadDomain {
	/**
	 * 플레이리스트 ID
	 */
	protected String playlistId;

	/**
	 * 튜터 ID
	 */
	protected String tutorId;

	/**
	 * 제목
	 */
	protected String title;

	/**
	 * 상세설명
	 */
	protected String desc;

	/**
	 * 조회수
	 */
	protected int viewCount;

	/**
	 * 튜터
	 */
	protected Tutor tutor;

	/**
	 * 영상
	 */
	protected List<Video> videos;
	
	public Playlist() {
		super();
	};
	
	public Playlist(List<String> lines) {
		super(lines);
		int i = 0;
		this.title = ZaadLineParser.getLineAsString(lines, i++);
		this.desc = ZaadLineParser.getLineAsString(lines, i++);
		this.viewCount = VideoLineParser.getIntValFromText(lines.get(i++));
	}
	
	public Playlist(String tutorId, String playlistId, List<String> lines) {
		this(lines);
		this.playlistId = playlistId;
		this.tutorId = tutorId;
	}
	
	/**
	 * @return the playlistId
	 */
	public String getPlaylistId() {
		return playlistId;
	}
	/**
	 * @param playlistId the playlistId to set
	 */
	public void setPlaylistId(String playlistId) {
		this.playlistId = playlistId;
	}
	/**
	 * @return the tutorId
	 */
	public String getTutorId() {
		return tutorId;
	}
	/**
	 * @param tutorId the tutorId to set
	 */
	public void setTutorId(String tutorId) {
		this.tutorId = tutorId;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the tutor
	 */
	public Tutor getTutor() {
		return tutor;
	}

	/**
	 * @param tutor the tutor to set
	 */
	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	/**
	 * @return the viewCount
	 */
	public int getViewCount() {
		return viewCount;
	}

	/**
	 * @param viewCount the viewCount to set
	 */
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
}
