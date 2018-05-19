package som.yj.oep;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yj.oep.mapper.UserMapper;

@ContextConfiguration(locations = "classpath:root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMybatsi {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void name() {
		System.out.println(userMapper.selectAllUsers());
	}
}
