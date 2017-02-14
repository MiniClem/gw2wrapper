package xhsun.gw2api.guildwars2.model.account;

import xhsun.gw2api.guildwars2.model.util.Item;

/**
 * For more info on Shared Inventory API go <a href="https://wiki.guildwars2.com/wiki/API:2/account/inventory">here</a><br/>
 * Shared Inventory item model class<br/>
 * if slot is empty, return null
 * @see Item item info
 * @author xhsun
 * @since 2017-02-07
 */

public class SharedInventory extends Storage{

	@Override
	public String toString(){
		return "{Item ID: "+super.getItemId()+" Count: "+super.getCount()+"}";
	}
}
