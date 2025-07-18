package Popuptasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
	   
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=1f89d616-2995-4672-a029-6c161b159bc2");
		
		
		driver.get("<a title=\"MarQ by Flipkart 6 kg 5 Star Rating Innowash Range Semi Automatic Top Load Washing Machine White, Maroon\" class=\"wjcEIp\" target=\"_blank\" rel=\"noopener noreferrer\" href=\"/marq-flipkart-6-kg-5-star-rating-innowash-range-semi-automatic-top-load-washing-machine-white-maroon/p/itm11df0fd0f85df?pid=WMNGYHCPZ5Y6NBV4&amp;lid=LSTWMNGYHCPZ5Y6NBV4QDLBPH&amp;marketplace=FLIPKART&amp;fm=neo%2Fmerchandising&amp;iid=M_c4f35a16-1e72-4714-922d-85b389be955d_20_FMBH2AIZB1KI_MC.WMNGYHCPZ5Y6NBV4&amp;ppt=hp&amp;ppn=homepage&amp;ssid=iqkduy2j7k0000001751102827205&amp;otracker=clp_pmu_v2_Washing%2BMachines_2_20.productCard.PMU_V2_MarQ%2Bby%2BFlipkart%2B6%2Bkg%2B5%2BStar%2BRating%2BInnowash%2BRange%2BSemi%2BAutomatic%2BTop%2BLoad%2BWashing%2BMachine%2BWhite%252C%2BMaroon_tvs-and-appliances-new-clp-store_WMNGYHCPZ5Y6NBV4_neo%2Fmerchandising_1&amp;otracker1=clp_pmu_v2_PINNED_neo%2Fmerchandising_Washing%2BMachines_LIST_productCard_cc_2_NA_view-all&amp;cid=WMNGYHCPZ5Y6NBV4\">MarQ by Flipkart 6 kg 5 Star Rating Innowash Range Semi Automatic...</a>");
		
		
		

	}

}
