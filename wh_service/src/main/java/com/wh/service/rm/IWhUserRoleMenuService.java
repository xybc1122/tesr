package com.wh.service.rm;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wh.base.ResponseBase;
import com.wh.entity.rm.WhUserRoleMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 角色菜单权限表 服务类
 * </p>
 *
 * @author 陈恩惠
 * @since 2019-06-14
 */
public interface IWhUserRoleMenuService extends IService<WhUserRoleMenu> {

    /**
     * 通过角色 id 去设置权限菜单
     *
     * @param rid
     * @return
     */
    ResponseBase setRoleMenu(Long rid, List<Integer> menus);

    /**
     * 移除权限菜单
     *
     * @return
     */
    ResponseBase delRoleMenu(List<Integer> rmIds);
}
