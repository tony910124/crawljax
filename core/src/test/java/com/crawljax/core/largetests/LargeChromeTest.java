package com.crawljax.core.largetests;

import com.crawljax.browser.EmbeddedBrowser.BrowserType;
import com.crawljax.core.CrawlSession;
import com.crawljax.core.configuration.BrowserConfiguration;
import com.crawljax.test.BrowserTest;
import com.crawljax.test.Utils;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

@Category(BrowserTest.class)
public class LargeChromeTest extends LargeTestBase {

	private static CrawlSession session;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Utils.assumeBinary("webdriver.chrome.driver", "chromedriver");

		session = setup(new BrowserConfiguration(BrowserType.CHROME), 100, 100);
	}

	@Override
	protected CrawlSession getSession() {
		return session;
	}
}
