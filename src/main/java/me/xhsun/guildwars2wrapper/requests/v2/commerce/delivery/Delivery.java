package me.xhsun.guildwars2wrapper.requests.v2.commerce.delivery;

import me.xhsun.guildwars2wrapper.error.GuildWars2Exception;
import me.xhsun.guildwars2wrapper.requests.GuildWars2API;
import me.xhsun.guildwars2wrapper.requests.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Delivery extends Request {

	protected Delivery(GuildWars2API gw2API) {
		super(gw2API);
	}

	//ASYNC
	/**
	 * For more info on delivery API go <a href="https://wiki.guildwars2.com/wiki/API:2/commerce/delivery">here</a><br/>
	 * Give user the access to {@link Callback#onResponse(Call, Response)} and {@link Callback#onFailure(Call, Throwable)} methods for custom interactions
	 *
	 * @param API      API key
	 * @param callback callback that is going to be used for {@link Call#enqueue(Callback)}
	 * @throws GuildWars2Exception  invalid API key
	 * @throws NullPointerException if given {@link Callback} is empty
	 * @see me.xhsun.guildwars2wrapper.model.v2.commerce.Delivery devlivery info
	 */
	public void getTPDeliveryInfo(String API, Callback<me.xhsun.guildwars2wrapper.model.v2.commerce.Delivery> callback) throws GuildWars2Exception, NullPointerException {
		isParamValid(new ParamChecker(ParamType.API, API));
		gw2API.getTPDeliveryInfo(API).enqueue(callback);
	}

	//SYNC
}