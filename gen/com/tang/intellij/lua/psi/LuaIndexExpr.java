// This is a generated file. Not intended for manual editing.
package com.tang.intellij.lua.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.StubBasedPsiElement;
import com.tang.intellij.lua.stubs.LuaIndexStub;
import com.intellij.navigation.ItemPresentation;
import com.tang.intellij.lua.lang.type.LuaTypeSet;
import com.tang.intellij.lua.search.SearchContext;

public interface LuaIndexExpr extends LuaExpr, PsiNameIdentifierOwner, StubBasedPsiElement<LuaIndexStub> {

  @NotNull
  List<LuaExpr> getExprList();

  @Nullable
  PsiElement getId();

  @Nullable
  PsiElement getNameIdentifier();

  @NotNull
  PsiElement setName(String name);

  @Nullable
  String getName();

  int getTextOffset();

  @NotNull
  ItemPresentation getPresentation();

  @Nullable
  LuaTypeSet guessPrefixType(SearchContext context);

  @Nullable
  LuaTypeSet guessValueType(SearchContext context);

  @Nullable
  PsiElement getDot();

  @Nullable
  PsiElement getColon();

}
