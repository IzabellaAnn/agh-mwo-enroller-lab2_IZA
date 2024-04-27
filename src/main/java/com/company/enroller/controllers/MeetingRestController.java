package com.company.enroller.controllers;

import com.company.enroller.model.Meeting;
import com.company.enroller.model.Participant;
import com.company.enroller.persistence.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/meetings")
public class MeetingRestController {
    @Autowired
    MeetingService meetingService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getMeetings(){
        Collection<Meeting> meetings = meetingService.getAll();
        return new ResponseEntity<CollaborationMeeting>(meeting, HttpStatus.OK);
}
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> getMeetings(@PathVariable ("id") long id) {

        if (meeting = null) {
            return new ResponseEntity<HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Participant>(meeting, HttpStatus.CREATED);
    }
}