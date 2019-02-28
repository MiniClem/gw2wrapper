package me.xhsun.guildwars2wrapper.requests.v2.pvp;

import me.xhsun.guildwars2wrapper.error.GuildWars2Exception;
import me.xhsun.guildwars2wrapper.model.v2.pvp.PvPGame;
import me.xhsun.guildwars2wrapper.requests.GuildWars2API;
import me.xhsun.guildwars2wrapper.requests.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class Games extends Request {
	protected Games(GuildWars2API gw2API) {
		super(gw2API);
	}

	//ASYNC
	/**
	 * For more info on pvp games API go <a href="https://wiki.guildwars2.com/wiki/API:2/pvp/games">here</a><br/>
	 * Give user the access to {@link Callback#onResponse(Call, Response)} and {@link Callback#onFailure(Call, Throwable)} methods for custom interactions
	 *
	 * @param api      Guild Wars 2 API key
	 * @param callback callback that is going to be used for {@link Call#enqueue(Callback)}
	 * @throws NullPointerException if given {@link Callback} is empty
	 * @throws GuildWars2Exception  invalid API key
	 * @see PvPGame pvp game info
	 */
	public void getAllPvPGameID(String api, Callback<List<String>> callback) throws GuildWars2Exception, NullPointerException {
		isParamValid(new ParamChecker(ParamType.API, api));
		gw2API.getAllPvPGameIDs(api).enqueue(callback);
	}

	/**
	 * For more info on pvp games API go <a href="https://wiki.guildwars2.com/wiki/API:2/pvp/games">here</a><br/>
	 * Give user the access to {@link Callback#onResponse(Call, Response)} and {@link Callback#onFailure(Call, Throwable)} methods for custom interactions
	 *
	 * @param api      Guild Wars 2 API key
	 * @param ids      list of pvp game id
	 * @param callback callback that is going to be used for {@link Call#enqueue(Callback)}
	 * @throws GuildWars2Exception  empty ID list
	 * @throws NullPointerException if given {@link Callback} is empty
	 * @see PvPGame pvp game info
	 */
	public void getPvPGameInfo(String api, String[] ids, Callback<List<PvPGame>> callback) throws GuildWars2Exception, NullPointerException {
		isParamValid(new ParamChecker(ParamType.API, api), new ParamChecker(ids));
		gw2API.getPvPGameInfo(api, processIds(ids)).enqueue(callback);
	}

	//SYNC
}
