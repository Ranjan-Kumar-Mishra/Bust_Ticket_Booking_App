package com.ticket.controller;

import com.ticket.entities.Bus;
import com.ticket.entities.BusOperator;
import com.ticket.entities.Route;
import com.ticket.entities.Schedule;
import com.ticket.service.impl.BusOperatorService;
import com.ticket.service.impl.BusService;
import com.ticket.service.impl.RouteService;
import com.ticket.service.impl.ScheduleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class BookingController {
    private BusService busService;
    private BusOperatorService busOperatorService;
    private RouteService routeService;
    private ScheduleService scheduleService;
    public BookingController(BusService busService, BusOperatorService
            busOperatorService, RouteService routeService, ScheduleService
                                     scheduleService) {
        this.busService = busService;
        this.busOperatorService = busOperatorService;
        this.routeService = routeService;
        this.scheduleService = scheduleService;
    }
    //http://localhost:8080/api/bus-opeartors
    @PostMapping("/bus-operators")
    public ResponseEntity<BusOperator> createBusOperator(@RequestBody
                                                         BusOperator busOperator){
        BusOperator createbusoperator =
                busOperatorService.createBusOperator(busOperator);
        return new ResponseEntity<>(createbusoperator,
                HttpStatus.CREATED);
    }
    //http://localhost:8080/api/buses
    @PostMapping("/buses")
    public ResponseEntity<Bus> createBus(@RequestBody Bus bus){
        Bus createBus = busService.createBus(bus);
        return new ResponseEntity<>(createBus, HttpStatus.CREATED);
    }
    //http://localhost:8080/api/routes
    @PostMapping("/routes")
    public ResponseEntity<Route> createRoute(@RequestBody Route route){
        Route createroute = routeService.createRoute(route);
        return new ResponseEntity<>(createroute,HttpStatus.CREATED);
    }
    //http://localhost:8080/api/schedules

    @PostMapping("/schedules")
    public ResponseEntity<Schedule> createSchedule(@RequestBody Schedule
                                                           schedule){
        Schedule createschedule = scheduleService.createSchedule(schedule);
        return new ResponseEntity<>(createschedule,HttpStatus.CREATED);
    }
}