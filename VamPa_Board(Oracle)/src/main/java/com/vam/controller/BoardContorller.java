package com.vam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vam.model.BoardVO;
import com.vam.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardContorller {
	
	private static final Logger log = LoggerFactory.getLogger(BoardContorller.class);
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
    // => @RequestMapping(value="list", method=RequestMethod.GET)
    public void boardListGET(BoardVO vo) {
        log.info("게시판 목록 페이지 진입");
        
    }
    
    @GetMapping("/enroll")
    // => @RequestMapping(value="enroll", method=RequestMethod.GET)
    public void boardEnrollGET() {
        
        log.info("게시판 등록 페이지 진입");
        
    }
    
    @PostMapping("/enroll")
    public String boardEnrollPost(BoardVO board, RedirectAttributes rttr) {
    	service.enroll(board);
    	
        log.info("BoardVO:" + board);
        
        rttr.addFlashAttribute("result", "enrol success");
        
        return "redirect:/board/list";
    }
	

}
