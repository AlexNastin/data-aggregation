package by.dt.controller;

import by.dt.entity.to.ui.TradingNetworkDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@RestController
@RequestMapping(path = "/data-aggregation/v1/tradingNetwork")
public class TradingNetworkController {

    @ApiOperation(value = "Getting a list of trading networks", notes = "Return a list of trading networks", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(method = RequestMethod.GET)
    public List<TradingNetworkDTO> getTradingNetworks() {
        return new ArrayList<>();
    }

    @RequestMapping(path = "/data-aggregation/v1/tradingNetwork2")
    public List<TradingNetworkDTO> test() {
        return new ArrayList<>();
    }
}
