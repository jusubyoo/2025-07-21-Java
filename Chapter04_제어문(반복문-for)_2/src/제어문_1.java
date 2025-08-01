/*
 *  제어문 : 실행시에 흐름을 개발자가 원하는 방향으로 바꿀 수 있게 만드는 것
 *   - 상황에 따라 변경 -> 조건문, 선택문
 *   - 프로그램 실행중에 계속 반복 -> 반복문(for,while)
 *     => 프로그램 종료 : break, continue
 *     => for : 반복 횟수 지정
 *     			=> 화면 출력/목록
 *     => while : 무한루프
 *     => do~while : 후조건 => 무조건 한번 이상 수행
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 1~10
		
		String html="<li class=\"common_sp_list_li\">\r\n"
				+ "                <div class=\"common_sp_thumb\">\r\n"
				+ "                    <a href=\"/recipe/7059176\" class=\"common_sp_link\">\r\n"
				+ "                                                <img src=\"https://recipe1.ezmember.co.kr/cache/recipe/2025/07/18/5f8fac2ed99b2c20e4436678d67a844c1_m.jpg\">\r\n"
				+ "                    </a>\r\n"
				+ "                </div>\r\n"
				+ "                <div class=\"common_sp_caption\">\r\n"
				+ "                                        <div class=\"common_sp_caption_tit line2\">110.상큼딸기양갱 만들기 (ft.우리들의여름) (2025.7.30)</div>\r\n"
				+ "                    <div class=\"common_sp_caption_rv_name\" style=\"display: inline-block; vertical-align: bottom;\">\r\n"
				+ "                        <a href=\"/profile/recipe.html?uid=25757478\"><img src=\"https://recipe1.ezmember.co.kr/cache/rpf/2025/04/14/1c4021b4b61a61c12b242a594594b0231.77bf95abca70e4f63d14d79d0dbf76f7\">벚꽃조이나</a>\r\n"
				+ "                    </div>\r\n"
				+ "                    <div class=\"common_sp_caption_rv\">\r\n"
				+ "                                                    <span class=\"common_sp_caption_rv_star\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"><img src=\"https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png\"></span>\r\n"
				+ "                            <span class=\"common_sp_caption_rv_ea\">(1)</span>\r\n"
				+ "                                                <span class=\"common_sp_caption_buyer\" style=\"vertical-align: middle;\">조회수 16</span>\r\n"
				+ "                    </div>\r\n"
				+ "                </div>\r\n"
				+ "            </li>";
		for(int i=0;i<10;i++)
		{
			System.out.println(html);
		}
	}

}
