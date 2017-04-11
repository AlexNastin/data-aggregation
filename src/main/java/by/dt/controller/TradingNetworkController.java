package by.dt.controller;

import by.dt.entity.to.ui.TradingNetworkDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping(path = "/data-aggregation/v1/tradingNetwork")
public class TradingNetworkController {

    @ApiOperation(value = "Getting a list of trading networks", notes = "Return a list of trading networks", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(method = RequestMethod.GET)
    public Set<TradingNetworkDTO> getTradingNetworks() {
        return new HashSet<>();
    }
}
